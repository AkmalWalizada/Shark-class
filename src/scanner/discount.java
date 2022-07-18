package scanner;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int qty = 20;
		 if (qty * 100 > 1000)
		 {
			 System.out.println("you get a discount " + (.1 *qty*100) +""
                       + "and your total is" + (qty*100-(0.1*qty*100))
					 );
		 }
		
		 else 
		 {
			 System.out.println(" not get discount " + (qty * 100));
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
