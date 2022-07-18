package singleinheritance;

public class student extends person  {
// Student class is sub class or child class	
	private String DOB;
	private String add;
	
public student () {
	DOB= "";
	add= "";
	
	
}

public String getDOB() {
	return DOB;
}

public void setDOB(String dOB) {
	DOB = dOB;
}

public String getAdd() {
	return add;
}

public void setAdd(String add) {
	this.add = add;
}
}

