package Loops;

public class doWhileLoops {

	private static final char Z = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		do
		{
			System.out.println("printing do while loop" + a);
			
			a++;
		}
		while (a<=10);
		
		
		String [] name = { "khan", "john", "joyti"};
		
		int index = 0;
		do {
			
			System.out.println(name [index]);
			index++;
			
		}
		while (index < name.length);
		
		
		
		
		
		char character = 'A';
		do {
			System.out.print(character);
			
			character ++;
		}
		
		
		while (character <= 'Z' );
		

		
		
		
		
		
	}

}
