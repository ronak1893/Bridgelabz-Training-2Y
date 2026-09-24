package gla.com;

class Book {
    public boolean price;
    int bookId;
    String title;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

}

public class Task1 {

    public static int removeDuplicates(Book[] books, int n) {
        if (n <= 1) {
            return n;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < n; i++) {

            if (books[i].bookId != books[uniqueIndex].bookId) {
                uniqueIndex++;
                books[uniqueIndex] = books[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "Java Programming"),
                new Book(101, "Java Programming"),
                new Book(102, "Data Structures"),
                new Book(103, "Algorithms"),
                new Book(103, "Algorithms"),
                new Book(104, "Operating Systems")
        };

        int initialCount = books.length;
        int uniqueCount = removeDuplicates(books, initialCount);

        System.out.println("Original Count: " + initialCount);
        System.out.println("Unique Count: " + uniqueCount);
        System.out.println("\nUnique Books:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("ID: " + books[i].bookId + " | Title: " + books[i].title);
        }
    }
}