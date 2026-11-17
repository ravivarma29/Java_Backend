package com.stringtasks;

public class StringTaskFive {
	public static void main(String[] args) {

		/*
		 * Find the first repeating character in a string Input : abca Output : a
		 */
		// String input ="abcda";
		String input = "ravi";
		boolean found = false;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					System.out.println(input.charAt(i));
					found = true;
					break;
				}
			}
			if (found == true) {
				break;
			} else {
				System.out.println("no Repeated");
				break;
			}
		}
	}
}
