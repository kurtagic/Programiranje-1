from itertools import product
import os

directory = "./results"
file = "odzivi.txt"

if not os.path.exists(directory):
    os.makedirs(directory)
    
file_path = os.path.join(directory, file)

# mozni odzivi
characters = ['-', 'o', '+']

# zgeneriraj permutacije
characters_permutations = list(product(characters, repeat=6))

# pretvori tuple -> string
permutations = [''.join(perm) for perm in characters_permutations]

with open(file_path, 'w') as file:
    for perm in permutations:
        file.write(perm + '\n')