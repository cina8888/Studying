from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.primitives import padding
import os

def encrypt_ecb(data: bytes, key: bytes) -> bytes:
    # Step 1: add padding for making divided 16 bytes
    padder = padding.PKCS7(128).padder()
    padded = padder.update(data) + padder.finalize()

    # Step 2: encrypted
    cipher = Cipher(algorithms.AES(key), modes.ECB())   # ECB dont need iv
    encryptor = cipher.encryptor()
    return encryptor.update(padded) + encryptor.finalize()

def decrypt_ecb(data: bytes, key: bytes) -> bytes:
    # Step 1: decrypted
    cipher = Cipher(algorithms.AES(key), modes.ECB())
    decryptor = cipher.decryptor()
    padded = decryptor.update(data) + decryptor.finalize()

    # Step 2: removed padding
    unpadder = padding.PKCS7(128).unpadder()
    origin_text = unpadder.update(padded) + unpadder.finalize()
    return origin_text