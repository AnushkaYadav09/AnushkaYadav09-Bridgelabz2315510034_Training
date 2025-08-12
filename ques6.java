package hr_java;
import java.util.*;
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal:");
		int P = sc.nextInt();
		System.out.println("Enter Rate:");
		double R = sc.nextDouble();
		System.out.println("Enter Time:");
		int T = sc.nextInt();
		double SI = (P*R*T)/100;
		System.out.println("Simple Interest"+ SI);
	}

}
