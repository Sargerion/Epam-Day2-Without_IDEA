package edu.epam.task.one.entity;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = scanner.next();
		System.out.println("Hello, " + name);
	}
}