import hashlib
from pathlib import Path

with open("data.txt", "rb") as f:
    message = f.read()


p = Path("data_hashed.txt")

with open(p, "w") as out:
    out.write(hashlib.sha256(message).hexdigest())


