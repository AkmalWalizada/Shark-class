package classObject;

public class Student {

	int id;
	String name;
	String lName;
	int age;
	
	
	
	public void insertData(int stu_ID, String F_Name , String L_Name) {
		
		id = stu_ID;
		name = F_Name;
		lName= L_Name;
	}
	
	public void show() {
		
		System.out.print(id + "  " + name + "  "+ lName);
		
	}

	/*
	
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		System.out.println(stu1.id = 1); 
		System.out.println(stu1.name= "Akmal");
		System.out.println(stu1.lName= "Walizada");
		stu1.age = 37;
		
		
		Student stu2 = new Student();
		
		stu2.id= 2;
		stu2.name= "Omar";
		stu2.lName= "Wlizada";
		stu2.age= 5;
	*/	
}
