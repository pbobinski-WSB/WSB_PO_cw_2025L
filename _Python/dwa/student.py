student = input("Podaj imię studenta: ")
grades = list(map(float, input("Podaj jego oceny oddzielone spacjami: ").split()))

print(f"Średnia ocen {student}: {sum(grades) / len(grades):.2f}")
