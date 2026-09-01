package Arrays_Level_1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr =new double[10];
        double total =0;
        int index =0;

        while(true)
        {
            if(index == 10)
            {
                break;
            }
            System.out.println("Enter number: ");
            double num =  sc.nextDouble();
            if(num<=0)
            {
                break;
            }
            arr[index] = num;
            index++;
        }
        System.out.println("---------------------------");
        for(int i=0;i<index;i++)
        {
            System.out.println(arr[i]);
            total += arr[i];
        }
        System.out.println("Total sum: "+total);
    }
}
