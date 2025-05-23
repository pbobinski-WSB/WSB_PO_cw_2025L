def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

n = int(input("Podaj liczbę: "))
primes = [i for i in range(2, n) if is_prime(i)]
print("Liczby pierwsze:", primes)


for i in range(2,n):
    if is_prime(i):
        print(str(i) + " ",end=", ")
            