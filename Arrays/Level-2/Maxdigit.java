import java.util.*;

class Maxdigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (n != 0)
        {
            if (index == maxDigit)
            {
                maxDigit = maxDigit + 10;           
                int[] temp = new int[maxDigit];  
                for (int i = 0; i < digits.length; i++)
                {
                    temp[i] = digits[i];
                }
                digits = temp; 
            }
            digits[index] = n % 10;
            n = n / 10;
            index++;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++)
        {
            if (digits[i] > largest)
            {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest)
            {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
