package Arrays_Level_1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter number "+(i+1)+ ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("------------------------");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                System.out.println(arr[i]+ " is positve and ");
                if(arr[i] % 2 ==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
            }
            else if(arr[i]<0)
            {
                System.out.println(arr[i]+ " is negative");
            }
            else
            {
                System.out.println("0 is Zero");
            } 
        }
         System.out.println();

        if (arr[0] == arr[4]) 
        {
            System.out.println("First and last elements are Equal.");
        } else if (arr[0] > arr[4])
        {
            System.out.println("First element is Greater.");
        } else
        {
            System.out.println("Last element is Greater.");
        }
    }
}
