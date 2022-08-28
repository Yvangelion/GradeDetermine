package Lab3dot2;

import java.util.Scanner;

public class Lab3dot2class {

	/* 
	 * Computer Science 1 Spring
	 * 3-2 Compute the perimeter  of a triangle
	 *
	 *This program reads 3 inputs from the user for the 3 sides of the triangle. With these 3 sides
	 *the program calculates the perimeter of the trianlge and determines if the triangle is valid or invalid.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  		

		System.out.print("Please enter side one of your trinagle: ");		

		double sideone = input.nextDouble();

		System.out.print("Please enter side two of your trinagle: ");		

		double sidetwo = input.nextDouble();

		System.out.print("Please enter side three of your trinagle: ");		

		double sidethree = input.nextDouble();

		if(sideone + sidetwo > sidethree && sidethree + sidetwo > sideone && sidethree + sideone > sidetwo){

			double perimeter = sideone + sidetwo + sidethree;

			System.out.println("Your triangle a valid and it's perimeter is " + perimeter);

		} else {
			System.out.println("Your triangle is invalid");

		}

		input.close(); 
	}

}
