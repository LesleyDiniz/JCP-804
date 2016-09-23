package com.br.diniz.jcp804.section5.stringProcessing;

public class Leasson1 {

	public static void main(String a[]) {
		String palindrome = "TESTE";
		int len = palindrome.length();
		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];
		
		for(int i = len; i > 0; i--) {
			tempCharArray[len - i] = palindrome.charAt(i-1);
		}
		System.out.println(new String(tempCharArray));

		// put original string in an
		// array of chars
		for (int i = 0; i < len; i++) {
			tempCharArray[i] = palindrome.charAt(i);
		}

		// reverse array of chars
		for (int j = 0; j < len; j++) {
			charArray[j] = tempCharArray[len - 1 - j];
		}

		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
		
		palindrome.getChars(0, len, tempCharArray, 0);
		System.out.println(tempCharArray);
	}
}
