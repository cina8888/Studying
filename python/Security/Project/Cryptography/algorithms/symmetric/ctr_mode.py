from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
import os

def encrypt_ctr(data: bytes, key: bytes) -> bytes:
    # Step 1: initiate 16 bytes (nonce + counter)
    nonce = os.urandom(16)

    # Step 2: encrypted
    cipher = Cipher(algorithms.AES(key), modes.CTR(nonce))
    encryptor = cipher.encryptor()
    ciphertext = encryptor.update(data) + encryptor.finalize()

    return nonce + ciphertext   # gắn nonce vào đầu để giải mã dùng lại

def decrypt_ctr(data: bytes, key: bytes) -> bytes:
    #Step 1: get nonce and ciphertext
    nonce = data[:16]            
    ciphertext = data[16:]

    # Step 2: decrypted
    cipher = Cipher(algorithms.AES(key), modes.CTR(nonce))
    decryptor = cipher.decryptor()
    return decryptor.update(ciphertext) + decryptor.finalize()