/*Write a program take the input of age from the user if the age is above 18 print 'You are eligible to vote'
else throw an exception that 'age is not correct'.*/

package pack2_29_12_22;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		//To Throw Exception if the age is below 18
		if(age >= 18) {
			System.out.println("You are eligible to vote.");
		}
		//if age i above 18
		
		else {
			throw new ArithmeticException("Age is not correct");
		}
		sc.close();
	}

}
