import json
import argon2
import argon2.low_level
import logging
import binascii

logger = logging.getLogger()
logger.setLevel(logging.INFO)

# Define fixed salt and pepper values
SALT = binascii.unhexlify('6e81fd3f1b81fd3f')  # Change this to your desired salt value
PEPPER = binascii.unhexlify('a18db83f02f65e7945c87582eaf6d4bb')  # Change this to your desired pepper value

def generate_password_hash(password):
    # Add fixed salt and pepper to the password before hashing
    password = SALT + password.encode() + PEPPER
    
    # Hash the password with Argon2 (Use the 'argon2.low_level' library to remove the random salt generation)
    hashed_password = argon2.low_level.hash_secret_raw(
        secret=password,
        salt=SALT,
        time_cost=16,
        memory_cost=65536,
        parallelism=8,
        hash_len=512,
        type=argon2.low_level.Type.ID
    )

    # Convert the hash to a hexadecimal string and return it
    return binascii.hexlify(hashed_password).decode()

# Example usage
password = "password123"
hash_value = generate_password_hash(password)
print(f"The hash value for password '{password}' is: {hash_value}")
