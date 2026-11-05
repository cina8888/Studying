import symmetric
import os

if __name__ == "__main__":
    a = symmetric.encrypt_cbc(os.urandom(17), os.urandom(32))
    print(a)