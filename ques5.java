package hr_java;

import java.util.*;
public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of cyclinder:");
		double r = sc.nextDouble();
		System.out.println("Enter height of cyclinder:");
		double h = sc.nextDouble();
		double Vol = 3.14 * (r*r) * h;
		System.out.println("Calculated Volume of Cyclinder " + Vol);

	}

}
