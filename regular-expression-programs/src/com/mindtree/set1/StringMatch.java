package com.mindtree.set1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringMatch {
	static final String o_pass = "Abhi9938";

	public static void main(String[] args) {
		String current_pass, new_pass;
		System.out.println("Enter your current password:: ");
		current_pass = entry();
		if (check(current_pass) == false) {
			System.out.println("You have entered a wrong password.\nTry again");
		} else {
			System.out.println("Enter your new password:: ");
			new_pass = entry();
			System.out.println("Thank you for your quick response.");
		}
	}

	private static boolean check(String current_pass) {

		if (Pattern.matches(o_pass, current_pass) == true) {
			return true;
		} else {
			return false;
		}
	}

	private static String entry() {
		String pass;
		Scanner scn = new Scanner(System.in);
		pass = scn.nextLine();
		return pass;
	}
}
