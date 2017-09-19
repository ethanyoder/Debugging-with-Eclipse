/*
 * Ethan Yoder
 * September 18, 2017
 * This class rotates a character array by a user-entered amount
 */

import java.util.*;

public class RotateArray {

	public static void main(String[] args) {
		
		//creates objects and arrays
		Scanner sc = new Scanner(System.in);
		char[] plainAlphabet = new char[26];
		
		plainAlphabet = fillArrayAlphabet(plainAlphabet);
		
		//prompts user to enter a shift
		System.out.println("Enter shift amount");
		int shift = sc.nextInt();
		sc.close();
		
		plainAlphabet = rotate(plainAlphabet, shift);
		
		//displays resulting alphabet
		for (int i = 0; i < 26; i++)
			System.out.print(plainAlphabet[i]);
		
	}
	
	public static char[] fillArrayAlphabet(char[] alphabet) {
		for (int i = 65; i < 91; i++) {
			alphabet[i - 65] = (char)i; 
		}
		return alphabet;
	}
	
	public static char[] rotate(char[] alphabet, int shift) {
		char[] methodCopyAlphabet = new char[26];
		for (int i = 0; i < 26; i++) {
			methodCopyAlphabet[i] = alphabet[i + shift];
		}
		return methodCopyAlphabet;
	}

}
