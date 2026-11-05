from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.primitives import padding
import os

def encrypt_cbc(data: bytes, key: bytes):
    # Step 1: Create iv with 16 bytes
    iv = os.urandom(16) 

    # Step 2: Add padding to make can divide 16
    padder = padding.PKCS7(128).padder() # 128 bit = 16 byte
    padded_data = padder.update(data) + padder.finalize()
    print(padded_data)

    # Step 3: Encrypt
    cipher = Cipher(algorithms.AES(key), modes.CBC(iv))
    encryptor = cipher.encryptor()
    ciphertext = encryptor.update(padded_data) + encryptor.finalize()
    return iv + ciphertext

def decrypt_cbc(data: bytes, key: bytes) -> bytes:
    # Step 1: get 16 bytes of iv and text encrypted
    iv = data[:16]
    ciphertext = data[16:]

    # Bước 2: decrypted CBC
    cipher = Cipher(algorithms.AES(key), modes.CBC(iv))
    decryptor = cipher.decryptor()
    padded_data = decryptor.update(ciphertext) + decryptor.finalize()

    # Bước 3: remove padding get origin text
    unpadder = padding.PKCS7(128).unpadder()
    text_origin = unpadder.update(padded_data) + unpadder.finalize()
    return text_origin
