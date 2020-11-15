package edu.epam.task.three.entity;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Enter count numbers :");
		int count = scanner.nextInt();
		for(int i = 0; i < count; i++) {
			System.out.println(rnd.nextInt(10));
		}
		for(int i = 0; i < count; i++) {
		System.out.print(rnd.nextInt(10) + " ");
		}
	}
}