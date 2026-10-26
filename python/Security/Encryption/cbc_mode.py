# Cipher Block Chaining
import secrets
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes

key = b'16,24,32letters ' # keys must be 128, 196, 256 bits

def encrypt(data):
    iv = secrets.token_bytes(16)
    cipher = Cipher(
        algorithms.AES(key),
        modes.CBC(iv),
    )
    encryptor= cipher.encryptor()
    return encryptor.update(data) + encryptor.finalize()

plaintext = b'the same message' * 2
x = encrypt(plaintext)
y = encrypt(plaintext)


print(x[:16] == y [16:])
print(x)
