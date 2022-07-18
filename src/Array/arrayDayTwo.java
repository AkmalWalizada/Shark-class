package Array;

public class arrayDayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String [][] userpass = {
			{"Akmal", "Akmal1"},
			{"Omar" , "Omar1"},
			{"Osman", "Osman1"},
			
			
	};
		
		
		for(int i = 0; i<userpass.length;i++)
			for(int e = 0; e < userpass[i].length; e++) {
				
				System.out.print(userpass [i][e] + " ");
			}
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String name [][] =
			{
					{"a","b","c", "d"},
					{"as","sd","fg"},
					{"er","rt","yu"},
					{"bgh","ght"}
			};
		
		
		for(int rows = 0 ; rows<name.length; rows++)
			for(int col = 0; col < name [rows].length; col++)
			{
				System.out.print(name [rows][col] + " ");
			}
		
		
	
		System.out.println();
		
		
		
		
		
		
		
		

	}

}
