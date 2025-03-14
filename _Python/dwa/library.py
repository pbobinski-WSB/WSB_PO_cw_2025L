library = []

def add_book(title, author):
    library.append({"title": title, "author": author, "available": True})

def borrow_book(title):
    for book in library:
        if book["title"] == title and book["available"]:
            book["available"] = False
            return f"Wypożyczono książkę: {title}"
    return "Książka niedostępna lub nie istnieje."

def return_book(title):
    for book in library:
        if book["title"] == title and not book["available"]:
            book["available"] = True
            return f"Zwrócono książkę: {title}"
    return "Nie można zwrócić tej książki."

def list_books():
    available_books = [book for book in library if book["available"]]
    return available_books if available_books else "Brak dostępnych książek."

# Test działania
add_book("Duma i uprzedzenie", "Jane Austen")
add_book("Wiedźmin", "Andrzej Sapkowski")

print(borrow_book("Duma i uprzedzenie"))
print(list_books())
print(return_book("Duma i uprzedzenie"))
print(list_books())
