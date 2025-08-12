package hr_java;
import java.util.*;

public class Assignment1 {
	public static void add(int a,int b) {
		int result = a+b;
		System.out.print(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		add(a,b);

	}

}
