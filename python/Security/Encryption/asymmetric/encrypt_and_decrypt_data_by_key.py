from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.asymmetric import padding

#Uses OAEP padding
padding_config = padding.OAEP(
    mgf=padding.MGF1(algorithm=hashes.SHA256()),
    algorithm=hashes.SHA256(),
    label=None
)

plaintext = b'message'

loaded_public_key='' #get by file generate_RSA_key.py
loaded_private_key='' #get by file generate_RSA_key.py

#Encrypts with the public key
ciphertext = loaded_public_key.encrypt(
    plaintext=plaintext,
    padding=padding_config
)

#Decrypts with the private key
decrypted_by_private_key = loaded_private_key.decrypt(
    ciphertext=ciphertext,
    padding=padding_config
)

assert decrypted_by_private_key == plaintext