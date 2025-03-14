def is_palindrome(word):
    word = word.lower()
    return word == word[::-1]

word = input("Podaj słowo: ")
print("To palindrom!" if is_palindrome(word) else "To nie jest palindrom.")
