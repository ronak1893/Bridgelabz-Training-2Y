package Arrays_Level_1;

import java.util.Scanner;

public class Student_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }
        System.out.println("\nResult:");
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid age");
            } else if (age[i] >= 18) {
                System.out.println("Student can vote " + age[i]);
            } else {
                System.out.println("Student can not vote " + age[i]);
            }
        }
    }
}
