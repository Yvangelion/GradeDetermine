package Lab3dot1;

import java.util.Scanner;

public class Lab3dot1class {

	/* 
	 * Computer Science 1 Spring
	 * 3-1 Convert Celsius to Fahrenheit and vice versa. 
	 *
	 *This program converts Celsius to Fahrenheit and vice versa based on a users choice from 
	 *a menu at the start of the program.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 

		System.out.println("1 = Fahrenheit  to Celsius");	

		System.out.println("2 = Celsius to Fahrenheit ");

		System.out.println("Please choose the kind of conversion you want to execute ( 1 or 2): ");

		int number = input.nextInt();

		switch (number) {
		case 1:
			System.out.print("Please enter your tempreture in degrees Fahrenheit: ");	
			double fahrenheit = input.nextDouble();

			double celsius = (fahrenheit - 32) * .556;

			System.out.println("Calculated Temperature in degrees celsius: "+ celsius);
			break;

		case 2:
			System.out.print("Please enter your tempreture in degrees celsius: ");	
			double celsius2 = input.nextDouble();

			double fahrenheit1 = (1.8 * celsius2) + 32;

			System.out.println("Calculated Temperature in degrees fahrenheit: "+ fahrenheit1);
			break;

		default:
			System.out.println("Please enter a valid value from the displayed menu");
			break;
		}
		input.close(); 
	}
}
