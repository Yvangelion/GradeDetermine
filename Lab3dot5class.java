package Lab3dot5;

import java.util.Scanner;

public class Lab3dot5class {

	/* 
	 * Computer Science 1 Spring
	 * 3-5 Grade Determination
	 *
	 *This program calculates the average of 3 grades inputed by the user and then provides the user 
	 *with a letter grade based on a 10 point system.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  

		System.out.println("Please enter values between 0-100");

		System.out.print("Please enter your first grade: ");		

		double score1 = input.nextDouble();

		System.out.print("Please enter your second grade: ");		

		double score2 = input.nextDouble();

		System.out.print("Please enter your third grade: ");		

		double score3 = input.nextDouble();

		double avaragescore = (score1 + score2 + score3) / 3;


		System.out.println("Your avarage score is: " + avaragescore);

		if(avaragescore > 89.999){

			System.out.println("Your Letter grade = A");
		}

		else if(avaragescore > 79.999){

			System.out.println("Your Letter grade = B");
		}
		else if(avaragescore > 69.999){

			System.out.println("Your Letter grade = C");

		} else if(avaragescore > 59.999){

			System.out.println("Your Letter grade = D");

		} else{
			System.out.println("Your Letter grade = F");
		}

		input.close(); 
	}
}


