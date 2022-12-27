package pack1String;


import java.util.Scanner;

public class ReverseUppercase {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter a string to reverse and convert to uppercase: ");
		String str = scanner.nextLine();
		String reversedStr = new StringBuffer(str).reverse().toString().toUpperCase();
		System.out.println("Reversed string in uppercase: " + reversedStr);
	}
  }
}
