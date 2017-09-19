/*
 * Ethan Yoder
 * September 18, 2017
 * This class mimics the echo utility until the user chooses to exit
 */

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		//instantiates Scanner class
		Scanner sc = new Scanner(System.in);
		
		//gives instructions to user
		System.out.println("echo utility: type 'exit' to stop program");
		
		//accepts input from the user
		String input = sc.nextLine();
			
		//loop runs until user enters "exit" as input
		while(!input.equals("exit")) {
			System.out.println(input);
		}

	}

}
