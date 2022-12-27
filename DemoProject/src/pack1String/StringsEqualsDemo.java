package pack1String;

import java.util.Scanner;

public class StringsEqualsDemo {
    public static void main(String[] args) {
        // Take two strings from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Please enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        
        // Compare the two strings
        if (str1.equals(str2)) {
            System.out.println("Both strings are same.");
        }
        else {
            System.out.println("Both strings are not same.");
        }
    }
}
