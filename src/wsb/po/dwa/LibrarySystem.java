package wsb.po.dwa;

import java.util.*;

public class LibrarySystem {
    static List<Map<String, Object>> library = new ArrayList<>();

    public static void addBook(String title, String author) {
        library.add(new HashMap<>() {{
            put("title", title);
            put("author", author);
            put("available", true);
        }});
    }

    public static String borrowBook(String title) {
        for (Map<String, Object> book : library) {
            if (book.get("title").equals(title) && (boolean)book.get("available")) {
                book.put("available",false);
                return "Wypożyczono książkę: " + title;
            }
        }
        return "Książka niedostępna lub nie istnieje.";
    }

    public static String returnBook(String title) {
        for (Map<String, Object> book : library) {
            if (book.get("title").equals(title) && !(boolean)book.get("available")) {
                book.put("available",true);
                return "Zwrócono książkę: " + title;
            }
        }
        return "Nie można zwrócić tej książki.";
    }

    public static void listBooks() {
        boolean found = false;
        for (Map<String, Object> book : library) {
            if ((boolean)book.get("available")) {
                System.out.println(book.get("title") + " - " + book.get("author"));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Brak dostępnych książek.");
        }
    }

    public static void main(String[] args) {
        addBook("Duma i uprzedzenie", "Jane Austen");
        addBook("Wiedźmin", "Andrzej Sapkowski");

        System.out.println(borrowBook("Duma i uprzedzenie"));
        listBooks();
        System.out.println(returnBook("Duma i uprzedzenie"));
        listBooks();
    }
}

