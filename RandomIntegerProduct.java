/*
 * Ethan Yoder
 * September 18, 2017
 * This class holds 10 random integers from 0-9 and displays the product
 */

import java.util.Random;

public class RandomIntegerProduct {

	public static void main(String[] args) {
		
		//instantiates Random class
		Random rand = new Random();
		
		//chooses and stores 10 random integers
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int num3 = rand.nextInt(10);
		int num4 = rand.nextInt(10);
		int num5 = rand.nextInt(10);
		int num6 = rand.nextInt(10);
		int num7 = rand.nextInt(10);
		int num8 = rand.nextInt(10);
		int num9 = rand.nextInt(10);
		int num10 = rand.nextInt(10);
		
		//calculates and stores the product of the 10 random integers
		int product = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;
		
		//displays the product
		System.out.println("Product of 10 random integers: " + product);
		
	}
	
}
