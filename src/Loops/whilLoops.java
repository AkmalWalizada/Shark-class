package Loops;

import java.util.Scanner;

public class whilLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your username");
		
		String username = scan.next();
		
		System.out.println("Please enter your password");
		
		String pass = scan.next();
		
		
		while (!(username.equals("Akmal") && pass.equals(("Omar")))) {
				
			System.out.println("try again");
			
			username = scan.next();
			
			pass = scan.next();
			
				}
		System.out.println("succesfully you entered to your account");
		
		
		
		
		
		

		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
