package Array;

public class arrayoractice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String [] name;
		
		name = new String [5];
		
		name [0] = "Kabul";
		name [1]=  "Mazar";
		name [2]= "Parwan";
		name [3] = "Panjsher";
		name [4] = "Farah";
		
		for ( int i = 0; i < name.length; i++)
		{
			System.out.print(name [i] + " ");
		}
		
		
		
		
		int [] age ;
		age = new int [5];
		
		age [0] = 40;
		age [1] = 50;
		age [2] = 60;
		age [3] = 70;
		age [4] = 80;
		
		for (int i = 0 ; i < age.length; i++)
		{
			System.out.println(age [i] + " ");
		}
		

		double [] price;
		price = new double [5 ];
		
		price [0] = 45;
		price [1] = 55;
		price [2] = 65;
		price [3] = 75;
		price [4] = 85;
		
		
		for(int i = 0; i < price.length; i++)
		{
			System.out.print(price [i] + " ");
		}
		
		
		
		int [] number = { 3,4,5,6,7,8,9};
		
	    for(int i = 0 ; i < number.length; i++)
	    {
	    	System.out.println(number[i] + " ");
	    }
		
		
		
		
		
		
		
		

	}

}
