package singleinheritance;

public class person {
	
	
	private int id;
	 private String fName;
	 private String lName;
	
	// zero parameterize constructor or default constructor  
public person() {
	
	id= 0 ;
	fName = "";
	lName = "";
	
}
	// parameterize constructor 



	public person (int id, String fName , String lName) {
		
		this.id = id ;
		this.fName = fName;
		this.lName = lName;
	}
	
	
	
	public void setfName(String n) {
		this.fName = n;
		
	}
	
	
	public String getfName () {
		return fName;
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String toString() {
		return "Student ID " +id + " First Name "+ fName + " Last Name " + lName ; 
	}
	
	
}
