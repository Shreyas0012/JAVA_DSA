import os
import shutil

print(os.getcwd())

dest = r"D:\java\main"

files = [f for f in os.listdir() if f.endswith(".class") and not os.path.isdir(f)]

for f in files:
    dest_path = os.path.join(dest, f)

    if os.path.exists(dest_path):
        os.remove(dest_path)   # remove old file

    shutil.move(f, dest)
