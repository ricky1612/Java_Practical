/* Write down a program where you take input of 2 numbers(i,j) from the user and divide the 
 * first number with second. Include exception handling mechanism.
 */

package pack2_29_12_22;

import java.util.Scanner;

public class DivideExample {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
 
        // nextInt() reads the next integer from the keyboard
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
 
        try {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero!");
        }
        
    }
}