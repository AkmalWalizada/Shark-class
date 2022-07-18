package operators;

public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 200;
		int num2 = 50;
		int num3 = 100;
		
		if (num1 > num2 && num2> num3) {
			System.out.println("Hello");
		}
		
		
		if (num1 > num2 && num3 > num2) {
			System.out.println("Java");
		}
		
		
		
		System.out.println(num1 > num2 && num3 > num2);
		
		
		System.out.println(num1 > num2 && num2> num3);
		
		
		
		int x = 1;
		int y = 2;
		int z = 5;
		System.out.println(x==1|| y==2 || z==5);
		
		System.out.println(x==y || y==2 || z==5);
		
		
		
		
		
		
		
	}

}
