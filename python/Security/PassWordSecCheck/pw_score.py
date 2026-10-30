import re
import math

def password_strength(password):
    """
    Returns a password strength score between 1 and 10.
    """

    score = 0

    # Length scoring
    length = len(password)
    if length >= 8:
        score += 2
    if length >= 12:
        score += 2
    if length >= 16:
        score += 1

    # Character variety
    if re.search(r"[a-z]", password):
        score += 1

    if re.search(r"[A-Z]", password):
        score += 1

    if re.search(r"\d", password):
        score += 1

    if re.search(r"[!@#$%^&*()_+\-=\[\]{};':\"\\|,.<>/?]", password):
        score += 1

    # Bonus for multiple character classes
    classes = 0
    classes += bool(re.search(r"[a-z]", password))
    classes += bool(re.search(r"[A-Z]", password))
    classes += bool(re.search(r"\d", password))
    classes += bool(re.search(r"[^A-Za-z0-9]", password))

    if classes == 4:
        score += 1

    # Penalties for common patterns
    common_patterns = [
        "password", "admin", "welcome", "qwerty",
        "123456", "abc123", "letmein"
    ]

    if any(pattern in password.lower() for pattern in common_patterns):
        score -= 2

    # Repeated characters penalty
    if re.search(r"(.)\1{2,}", password):
        score -= 1

    # Ensure score is between 1 and 10
    score = max(1, min(score, 10))

    return score


def strength_label(score):
    if score <= 2:
        return "Very Weak"
    elif score <= 4:
        return "Weak"
    elif score <= 6:
        return "Moderate"
    elif score <= 8:
        return "Strong"
    else:
        return "Very Strong"


# Example usage
password = input("Enter password: ")

score = password_strength(password)
label = strength_label(score)

print(f"\nPassword Strength Score: {score}/10")
print(f"Rating: {label}")