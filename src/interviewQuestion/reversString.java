package interviewQuestion;

public class reversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String schoolname = "Tek School";
		
		for (int i = schoolname.length()-1; i >=0; i--) {
			System.out.print(schoolname.charAt(i));
		}
		
		
		
		String Name = "tek school";
		
		StringBuilder obj = new StringBuilder(Name);
		System.out.println(obj.reverse());
		
		
		
		String name = "tek school is located in VA";
		int count = 0;
		for (int i = 0 ; i <name.length();i++) {
			if (name.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
