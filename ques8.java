package hr_java;

import java.util.Scanner;

public class ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base:");
		double B = sc.nextDouble();
		System.out.println("Enter Exponent:");
		double E = sc.nextDouble();
		double res = Math.pow(B, E);
		System.out.println(res);

	}

}
