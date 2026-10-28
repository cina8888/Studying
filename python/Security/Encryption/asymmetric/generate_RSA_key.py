# Complex low-level API
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.primitives.asymmetric import rsa

# 1. RSA key-pair generation in Python

# Private-key generation
private_key = rsa.generate_private_key(
            public_exponent=65537,
            key_size=3072,
)

# Public-key extraction
public_key = private_key.public_key()

# 2. RSA key-pair serialization in Python

# Private-key serialization
private_bytes = private_key.private_bytes(
            encoding=serialization.Encoding.PEM,
            format=serialization.PrivateFormat.PKCS8,
            encryption_algorithm=serialization.NoEncryption() 
)

with open('private_key.pem', 'xb') as private_file:
    private_file.write(private_bytes)

# Public-key serialization
public_bytes = public_key.public_bytes(
            encoding=serialization.Encoding.PEM,
            format=serialization.PublicFormat.SubjectPublicKeyInfo
)

with open('public_key.pem', 'xb') as public_file:
    public_file.write(public_bytes)

# 3. RSA key-pair deserialization in Python

# Private-key deserialization
with open('private_key.pem', 'rb') as private_file:
    loaded_private_key = serialization.load_pem_private_key(
    private_file.read(),
    password=None
)

# Public-key deserialization
with open('public_key.pem', 'rb') as public_file:
    loaded_public_key = serialization.load_pem_public_key(
    public_file.read()
)