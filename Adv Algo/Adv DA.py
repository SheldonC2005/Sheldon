import hashlib
import random
import matplotlib.pyplot as plt
import numpy as np

# Sample Twitter usernames (you can replace this with real user IDs from a dataset)
twitter_users = [
    "alice", "bob", "carol", "dave", "eve", "frank", "grace",
    "heidi", "ivan", "judy", "mallory", "oscar", "peggy",
    "trent", "victor", "walter", "zara", "bob", "carol", "alice"
]

# Ensure duplicates exist to test distinct counting
random.shuffle(twitter_users)

# Helper function to count trailing zeros in binary string
def count_trailing_zeros(bin_str):
    return len(bin_str) - len(bin_str.rstrip('0'))

# Function to hash and get trailing zero counts
def flajolet_martin_hash(users, hash_func):
    max_trailing_zeros = 0
    trailing_zero_counts = []

    for user in users:
        hash_object = hash_func(user.encode('utf-8')).hexdigest()
        bin_hash = bin(int(hash_object, 16))[2:].zfill(128)
        tz = count_trailing_zeros(bin_hash)
        trailing_zero_counts.append(tz)
        max_trailing_zeros = max(max_trailing_zeros, tz)

    estimate = 2 ** max_trailing_zeros
    return estimate, trailing_zero_counts

# Dictionary of hash functions to apply
hash_functions = {
    'MD5': hashlib.md5,
    'SHA1': hashlib.sha1,
    'SHA256': hashlib.sha256
}

# Visualization and output
plt.figure(figsize=(15, 5))
actual_unique = len(set(twitter_users))

for idx, (name, func) in enumerate(hash_functions.items()):
    estimate, tz_counts = flajolet_martin_hash(twitter_users, func)
    print(f"{name} - Estimated Distinct Users: {estimate}, Actual: {actual_unique}")

    plt.subplot(1, 3, idx + 1)
    plt.hist(tz_counts, bins=range(max(tz_counts)+2), edgecolor='black')
    plt.title(f"{name} Trailing Zeros")
    plt.xlabel("Trailing Zero Count")
    plt.ylabel("Frequency")
    plt.axvline(np.log2(actual_unique), color='r', linestyle='dashed', label='log2(Actual)')
    plt.axvline(np.log2(estimate), color='g', linestyle='dotted', label='log2(Estimated)')
    plt.legend()

plt.suptitle("Flajolet-Martin: Trailing Zero Distributions per Hash")
plt.tight_layout()
plt.show()
