package hr_java;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd num:");
		int b = sc.nextInt();
		System.out.println("Enter 3rd num:");
		int c = sc.nextInt();
		double res = (a+b+c)/3;
		System.out.println("Average of three numbers: "+res);
	}

}
