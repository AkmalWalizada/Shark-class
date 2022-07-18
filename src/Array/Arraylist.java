package Array;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> data = new ArrayList<String>();
		
		
		
		data.add ("Test");
		data.add ("some other value");
		
		System.out.println(data);
		System.out.println(data.get (0));
		System.out.println(data.get (1));
		
		
		
		for (int i = 0; i< data.size(); i++) {
			System.out.println(data.get (i));
		}
		
		
		
		System.out.println(data.get(0));
		
		
		
		

	}

}
