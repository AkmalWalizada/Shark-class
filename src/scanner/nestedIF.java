package scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class nestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age = 20;
		int weight = 50;
		
		if (age > 18)
		{
			if (weight >= 50)
			{
				System.out.println("you can donate blood");
			}	else
			{
				System.out.println("your weight must be 50");
			}
			
			
		}
		
		
		else 
		{
			System.out.println("age must be greater then 18");
		}
		
		
		
	
		
		
		
		
		
	}

}
