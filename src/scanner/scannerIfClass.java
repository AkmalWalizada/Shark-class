package scanner;

import java.util.Scanner;

public class scannerIfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if ( num >10)
			
		{
			System.out.println("you can buy a ticket ");
		}
		
		else if (num >= 80)
		{
			System.out.println("your not eligible" );
		}
		
		
		else if  (num < 10 )
		
		{
			System.out.println("you can not buy a ticket ");
		}
		
		else 
			
		{
			System.out.println("thank you");
		}
			
		System.out.println("end of programm ");
		
		
		
		
		
		
		
		
		
		

	}

}
