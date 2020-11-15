package edu.epam.task.five.entity;

public class IntArguments{
	public static void main(String[] args) {
		int sum = 0;
		int mul = 1;
		for(int i = 0; i < args.length; i++) {
			int argument = Integer.parseInt(args[i]);
			sum += argument;
			mul *= argument;
		}
		System.out.println("Sum = " + sum + "\n" + "Multiply : " + mul);
	}
}
