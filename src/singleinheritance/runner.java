package singleinheritance;

public class runner {

	public static void main(String[] args) {
		
		
		
		
		physicTeacher obj = new physicTeacher();
		
		System.out.println("Designation:"  +  obj.desigtion);
		
		System.out.println(" Collage Name " + obj.collage);
		System.out.println(" Main Subject " + obj.mainSubject);
		
		obj.teacherDO();
	}

}
