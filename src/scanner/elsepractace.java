package scanner;

import java.util.Scanner;

public class elsepractace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter irina age");
		
		
		int irina = sc.nextInt();
		System.out.println("enter Ovi age");
		
		int ovi = sc.nextInt();
		System.out.println("enter ahmad age");
		int ahmad = sc.nextInt();
		if (irina> ovi && irina > ahmad)
		{
			System.out.println("irina is oldest");
		}
		
		else if (ovi > irina &&ovi > ahmad)
		{
			System.out.println(" Ovi is the oldest");
		}
		
		else if (ahmad > irina && ahmad > ovi)
		{
			System.out.println("Ahmad is oldest");
		}
		
		
	}

}
