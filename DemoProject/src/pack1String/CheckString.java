package pack1String;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first string: ");
			String str1 = sc.nextLine();
			System.out.println("Enter the second string: ");
			String str2 = sc.nextLine();

			if (str2.equals(str1)) {
			    System.out.println(str1 + " exists in " + str2);
			} else {
			    System.out.println(str1 + " does not exist in " + str2);
			}
		}
    }
}
