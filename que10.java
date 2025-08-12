package hr_java;

import java.util.Scanner;

public class que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kilometer");
		double kilo = sc.nextDouble();
		double miles = kilo * 0.621371;
		System.out.println("Miles into Kilometer: "+ miles);
	}

}
