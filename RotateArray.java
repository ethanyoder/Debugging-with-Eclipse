/*
 * Ethan Yoder
 * September 18, 2017
 * This class rotates a character array by a user-entered amount
 */

import java.util.*;

public class RotateArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] plainAlphabet = new char[26];
		plainAlphabet = fillArrayAlphabet(plainAlphabet);
		System.out.println("Enter shift amount");
		int shift = sc.nextInt();
		
	}
	
	public static char[] fillArrayAlphabet(char[] alphabet) {
		for (int i = 65; i < 91; i++) {
			alphabet[i - 65] = (char)i; 
		}
		return alphabet;
	}
	
	public static char[] rotate(char[] alphabet) {
		return null;
	}

}
