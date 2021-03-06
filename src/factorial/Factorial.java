package factorial;

import java.util.Scanner;

/**
 * Calculate factorials!
 * @author Kevin Ji
 */
public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        
        int product = 1;
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
    
    public static int recursiveFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * recursiveFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(10)); // 3628800
        
        System.out.println("Calculate the factorial of:");
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        System.out.println(factorial(number));
    }
}
