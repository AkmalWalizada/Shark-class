 package this_super;

public class this_keywork {
	
	int ID;
	String Name;



public this_keywork () {
	
	this.ID = 0;
	this.Name ="";
	
	System.out.println("zero parameraize");
	
}

public this_keywork (int ID , String Name) {
	
	this.ID = ID;
	this.Name = Name;
	
	
}

public static void main(String[] args) {
	
	this_keywork obj = new this_keywork (100 , "Akmal");
	
	System.out.println(obj.ID);
	System.out.println(obj.Name);
	
}

}