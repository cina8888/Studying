import os
from cryptography.fernet import Fernet

def generate_and_savekey(env_path = ".env"):
    newkey = Fernet.generate_key().decode("utf-8")

    if not os.path.exists(env_path):
        with open(env_path, "w") as f:
            f.write(f"PRIMARY_FERNET_KEY={newkey}\n")
        print("Done with generating key!")
    else:
        print("File .env exists!")


if __name__ == "__main__":
    generate_and_savekey()
