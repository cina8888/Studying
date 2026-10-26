import os
from cryptography.fernet import Fernet, MultiFernet
from dotenv import load_dotenv

# ONLY USE WITH REAL .env


# 1. Take key
load_dotenv()

def get_multi_key():
    keys = []

    # 2. Take Primary Key
    primary_key = os.getenv("PRIMARY_FERNET_KEY")
    if not primary_key:
        raise ValueError("Primary Key not found in .env!")
    keys.append(Fernet(primary_key.encode("utf-8")))

    # 3. Take all secondary key
    index = 1
    while True:
        sec_key = os.getenv(f"SECONDARY_FERNET_KEY_{index}")
        if not sec_key:
            break
        keys.append(Fernet(sec_key.encode("utf-8")))
        index += 1

    # 4. Return object MultiFernet Key
    return MultiFernet(keys)

if __name__=="__main__":
    multi_fernet = get_multi_key()

    secret_msg = "This is a secret"
    encrypt_token = multi_fernet.encrypt(secret_msg.encode("utf-8"))
    print(f"Token encrypted: {encrypt_token}")

    decrypt_bytes = multi_fernet.decrypt(encrypt_token)
    print(f"Data decrypted: {decrypt_bytes}")


