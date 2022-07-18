package abstract_Example;

public class WFCard implements VisaCard {
	
	
	private String name;
	private String pin;
	private double balance;
	
	
	 

	public WFCard() {
		super();
	}

	public WFCard(String name, String pin, double balance) {
		super();
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}

	@Override
	public String printcardinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBalance(String pin) {
		// TODO Auto-generated method stub
		return 0;
	}

}
