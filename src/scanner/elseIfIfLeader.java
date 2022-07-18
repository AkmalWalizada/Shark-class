package scanner;

import java.util.Scanner;

public class elseIfIfLeader {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		if (num > 0)
		{
			System.out.println(" positive number");
		}
		
		else if (num < 0)
		
		{
			System.out.println(" Negative Number");
		}
		
		
		else
		{
			System.out.println("you entered zero");
		}
		
	}
	
}
