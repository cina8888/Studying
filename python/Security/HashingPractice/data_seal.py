from pathlib import Path
import hashlib

def save_and_seal(file_path, key):
    data_path =  Path(file_path)
    hash_path = data_path.with_suffix('.hash')

    # 1. Read and cal hash
    data = data_path.read_bytes()
    hash_value = hashlib.blake2b(data, key=key).hexdigest()

    # 2. Write Hash to hash file
    hash_path.write_text(hash_value)

def is_modified(file_path, key):
    data_path = Path(file_path)
    hash_path = data_path.with_suffix('.hash')

    data = data_path.read_bytes()
    origin_hash_value = hash_path.read_text()

    hash_value = hashlib.blake2b(data, key = key).hexdigest()
    return origin_hash_value != hash_value

a = is_modified(r".\data.txt", b'testkey')
print(a)

