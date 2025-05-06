package jdbc_project_1;
import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Square a number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Square of "+n+" is "+(n*n));
	}

}
