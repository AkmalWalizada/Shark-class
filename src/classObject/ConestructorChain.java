package classObject;

public class ConestructorChain {
	
	public ConestructorChain () {
		
		this(40,50);
		
		System.out.println("0 parametar conestructor");
			
			
		
		
	}

	
	
	
	public ConestructorChain (int a , int b) {
		
		this("Akmal" ,a,b);
		
		System.out.println("sum of a + b is : " + (a+b));
	}
	
	
	
	
	public ConestructorChain (String Name , int a , int b) {
		
		System.out.println("the teache salary is :" + (a+ b));
		
		
		
		
	}
	
	public static void main(String[] args) {
		
	
	ConestructorChain obj = new ConestructorChain();
	
	
	
	}	
}
