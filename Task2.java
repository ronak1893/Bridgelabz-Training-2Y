package gla.com;

public class Task2 {

    public static void searchByTitle(Book[] books, int count, String query) {
        System.out.println("Search results for: \"" + query + "\"\n");

        boolean foundAny = false;
        String searchQuery = query.toLowerCase();

        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(searchQuery)) {
                System.out.println("ID: " + books[i].bookId + " | Title: " + books[i].title);
                foundAny = true;
            }
        }

        if (!foundAny) {
            System.out.println("No matching books found.");
        }
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "Java Programming"),
                new Book(102, "Data Structures"),
                new Book(103, "Algorithms"),
                new Book(104, "ADVANCED JAVA"),
                new Book(105, "Database Management Systems")
        };

        int count = books.length;

        searchByTitle(books, count, "data");

        System.out.println("-----------------------------------");

        searchByTitle(books, count, "java");
    }
}
