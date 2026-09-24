public class Task3 {

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
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Basics", 500),
                new Book("Python for Beginners", 300),
                new Book("Data Structures", 700),
                new Book("C Programming", 200),
                new Book("Web Development", 450)
        };

        int count = books.length;
        System.out.println("Books before sorting:");
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
        sortByPrice(books, count);
        System.out.println("\nBooks after sorting by price:");
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}



