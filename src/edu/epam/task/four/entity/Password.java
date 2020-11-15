package edu.epam.task.four.entity;

import java.io.Console;

public class Password {
	public static void main(String[] args) {
		String templatePassword = "qwerty";
		Console console = System.console();
		if(console != null) {
			String password = console.readLine("Enter password(qwerty) : ");
			if (password.equals(templatePassword)) {
				System.out.println("Password is correct!");
			} else {
				System.out.println("Password isn't correct!");
			}
		}
	}
}