package Loops;

import java.util.Scanner;

public class brealContinueLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int x = 1;
		
		do {
			if ( x==6)
				//break;
				continue;
				
			System.out.println(x);
			x++;
			
		}
		
		while (x <= 6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner (System.in);
		
		int limit = 5;
		do {
			System.out.println("enter the first number");
			int number1= scan.nextInt();
			System.out.println("enter the second number");
			int number2 = scan.nextInt();
			
			if(number1<=0 || number2 <= 0)
			{
				//break;
				
				continue;
			}
			
			System.out.println(number1 / number2);
		}
		
		while (limit>0);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
