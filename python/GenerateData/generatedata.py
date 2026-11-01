from faker import Faker
from pathlib import Path

fake = Faker()

def get_registered_user():
    return {
        "name": fake.name(),
        "address": fake.address(),
        "year": fake.year()
    }

def generate_text(path):
    p = Path(path)
    p.parent.mkdir(parents=True, exist_ok=True)   
    with open(p, "w", encoding="utf-8") as out:
        out.write(fake.text(max_nb_chars=3600))

generate_text(r"D:\self_study\Git_push\Python\Security\Project\DataAnalyst\data.txt")