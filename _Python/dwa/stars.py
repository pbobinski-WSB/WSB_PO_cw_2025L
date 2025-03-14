n = int(input("Podaj wysokość piramidy: "))

for i in range(1, n + 1):
    print(" " * (n - i) + "*" * (2 * i - 1))
