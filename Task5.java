public class Task5 {

    static class Book {
        double price;

        Book(double price) {
            this.price = price;
        }
    }

    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {

        int left = 0;
        double currentSum = 0;
        int minLength = count + 1;

        for (int right = 0; right < count; right++) {

            // Expand window
            currentSum += books[right].price;

            // Contract window while sum is enough
            while (currentSum >= targetCost) {

                int currentLength = right - left + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                }

                currentSum -= books[left].price;
                left++;
            }
        }

        // No valid subarray found
        if (minLength == count + 1) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(20),
                new Book(30),
                new Book(40),
                new Book(10),
                new Book(50)
        };

        int count = books.length;
        double targetCost = 70;

        int answer = minBooksForTargetCost(books, count, targetCost);

        System.out.println("Minimum number of books = " + answer);
    }
}

