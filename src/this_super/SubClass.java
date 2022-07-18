package this_super;

public class SubClass extends Super_Keywork{
	
	int num = 300;
	int num1 = 400;
	
	
	void print() {
		
		System.out.println(super.num1);
		System.out.println(super.num);
		System.out.println(this.num);
		System.out.println(this.num1);
	}
	
	
	
	public static void main(String[] args) {
		
		
		 SubClass obj = new SubClass();
		 
		 obj.print();
		
	}

}
