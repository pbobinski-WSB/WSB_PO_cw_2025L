filename = input("Podaj nazwę pliku: ")

with open(filename, "r") as file:
    content = file.read()

lines = content.split("\n")
words = content.split()
characters = len(content)

print(f"Wiersze: {len(lines)}, Słowa: {len(words)}, Znaki: {characters}")
