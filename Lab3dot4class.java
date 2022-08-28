package Lab3dot4;

import java.util.Scanner;

public class Lab3dot4class {


	/* Y
	 * Computer Science 1 Spring
	 * 3-4 Middle Value
	 *
	 *This program outputs the middle value of 3 values inputed by the user. 
	 *The program uses swap to output the middle value inputed by the user.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 

		System.out.println("Please enter your first value:");

		double value1 = input.nextDouble(); 

		System.out.println("Please enter your second value:");

		double value2 = input.nextDouble();

		System.out.println("Please enter your third value:");

		double value3 = input.nextDouble(); 

		double temp;

		if(value1 > value2) {
			temp = value1;
			value1 = value2;
			value2 = temp;
		}

		if(value2 > value3) {
			temp = value2;
			value2 = value3;
			value3 = temp;
		}

		if(value1 > value2) {
			temp = value1;
			value1 = value2;
			value2 = temp;
		}

		System.out.println("The middle value is : " + value2);

		input.close(); 

	}
}
