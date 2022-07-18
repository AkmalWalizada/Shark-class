package Array;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "ABC abc zsr";
		
		
		String replace = str.replace("A", "Z");
		
		System.out.println(replace);
		
		String str1 = "sdafa3AAAAAA2345$%&#sdfdfgg";
		
		String replaceAll = str.replaceAll("[^a-z]" , " ");
		
		
		System.out.println(replaceAll);
		
		
		
		String str2 = "Please email us at kamal@tekschool.com";
		
		String [] split = str2.split("at");
		
		System.out.println(split[0]);
		
		System.out.println(split[1]);
		
		
		
		String str3 = "Student at tekschool at VA";
		
		String [] split2 = str3.split("at");
		
		System.out.println(split2[2]);
		
		
		String str4 = "Java is programing language";
		
		boolean contains = str4.contains("Java");
		
		System.out.println(contains);
		
		
		
		
		String fName = " Ovi";
		String LName = "MD";
		String fullname = fName.concat(LName);
		
		System.out.println(fullname);
				
		
		
		
		String str5 = "        Walizada";
		
		String LastName = str5.trim();
		
		System.out.println(LastName);
		
		
		String str6 = "School";
		
		String upperCase = str6.toUpperCase();
		
		System.out.println(upperCase);
		
		String lowerCase = str6.toLowerCase();
		
		System.out.println(lowerCase);
		
	}

}
