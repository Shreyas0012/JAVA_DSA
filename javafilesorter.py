import os
import shutil

print(f"Current working directory: {os.getcwd()}")

dest_dir = r"D:\java\JAVA_DSA\main"

# Create destination directory if it doesn't exist
if not os.path.exists(dest_dir):
    os.makedirs(dest_dir)
    print(f"Created directory: {dest_dir}")

# Walk through all directories and subdirectories
for dirpath, _, filenames in os.walk('.'):
    # Ignore the destination directory itself to avoid moving files that are already there
    if os.path.abspath(dirpath) == os.path.abspath(dest_dir):
        continue

    for filename in filenames:
        if filename.endswith(".class"):
            source_path = os.path.join(dirpath, filename)
            dest_path = os.path.join(dest_dir, filename)

            print(f"Found .class file: {source_path}")

            # If a file with the same name exists in the destination, remove it.
            if os.path.exists(dest_path):
                print(f"Removing existing file: {dest_path}")
                os.remove(dest_path)

            # Move the file
            try:
                shutil.move(source_path, dest_dir)
                print(f"Moved {filename} to {dest_dir}")
            except shutil.Error as e:
                print(f"Error moving file {filename}: {e}")

print("File moving process completed.")
