package Array;

public class arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double [] price;
		 price = new double [5];
		
		price [0]= 23.45;
		price [1]= 45.5;
		price [2]= 23;
		price [3]= 34.5;
		price [4]= 65.6;
		
	
		
		for(int e = 0 ; e < price.length; e++)
		{
			System.out.println(price[e]);
			
		}
		
		
		String [] name = { "Khan", "Daviad", "Akmal", "John", "Fawad"};
				
		System.out.println(name.length);
		
		
		for (int i = 0; i< name.length; i++)
		{
			System.out.print(name [i] + " ");
		}
		
		
		
		int [] age;
		age= new int [6];
		
		age [0]= 20;
		age [1]= 30;
		age [2]= 40;
		age [3]= 50;
		age [4]= 60;
		age [5]= 70;
		
		
		for (int i = 0 ; i < age.length; i++)
		{
			System.out.println(age[i]);
		}
		
		
		
		
		
		
		

	}

}
