package sumnumber;

import java.util.Scanner;

/**
 * Sum numbers up to the number inputted.
 * @author Kevin Ji
 */
public class SumNumber {
    public static void main(String[] args) {      
        System.out.println("Enter your number:");
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum + ".");
    }
}
