package scanner;

public class schoolGread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int marks = 40;
		
		if (marks< 50)
		{
			System.out.println("your faild");
		}
		
		else if (marks >= 50 && marks<60)
		{
			System.out.println("D");
		}
		
		else if (marks>= 60 && marks< 70)
		{
			System.out.println("C");
		}
		else if (marks>=70 && marks < 80)
		{
			System.out.println("B");
		}
		
		else if (marks>= 80 && marks <90)
		{
			System.out.println("A");
		}
		else if (marks >= 90 && marks<= 100)
		{
			System.out.println("A+");
		}
	
		else
		{
			System.out.println("please enter the number");
		}
		
		
		
	}

}
