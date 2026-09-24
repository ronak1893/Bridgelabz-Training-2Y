package gla.com;

public class Task4 {
    static class Book {
        String title;
        double price;

        Book(String title, double price) {
            this.title = title;
            this.price = price;
        }
        double getPrice() {
            return price;
        }
        void display() {
            System.out.println(title + " - $" + price);
        }
    }
    public static void sortByPrice(Book[] books, int count) {

        int swaps = 0;

        for (int i = 0; i < count - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < count; j++) {

                if (books[j].getPrice() < books[minIndex].getPrice()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Book temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;

                swaps++;
            }
        }
        System.out.println("Number of swaps: " + swaps);
    }
    public static int searchByPrice(Book[] books, int count, double targetPrice) {

        int left = 0;
        int right = count - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (books[middle].getPrice() == targetPrice) {
                return middle;
            }
            if (books[middle].getPrice() < targetPrice) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Basics", 500),
                new Book("Python for Beginners", 300),
                new Book("Data Structures", 700),
                new Book("C Programming", 200),
                new Book("Web Development", 450)
        };

        int count = books.length;
        sortByPrice(books, count);
        System.out.println("\nBooks sorted by price:");

        for (int i = 0; i < count; i++) {
            System.out.println(i + ": " + books[i].title
                    + " - $" + books[i].price);
        }
        double targetPrice = 450;
        int result = searchByPrice(books, count, targetPrice);
        if (result != -1) {
            System.out.println("\nBook found!");
            System.out.println("Index: " + result);
            System.out.println("Book: " + books[result].title);
            System.out.println("Price: $" + books[result].price);
        } else {
            System.out.println("\nBook with price $" + targetPrice
                    + " was not found.");
        }
    }
}

