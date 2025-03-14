numbers = list(map(int, input("Podaj liczby oddzielone spacjami: ").split()))

print("Suma:", sum(numbers))
print("Średnia:", sum(numbers) / len(numbers))
print("Najmniejsza liczba:", min(numbers))
print("Największa liczba:", max(numbers))
print("Sortowanie rosnąco:", sorted(numbers))
print("Sortowanie malejąco:", sorted(numbers, reverse=True))
