package inClass;

public class CreditCard {
	private String cardNumber;
	private double expenses;
	public void charge(double amount) {
		expenses += amount;
	}
	
	public String getCardNumber(String password) {
		if(password.equals("SECRET!3*!")) {
			return cardNumber;
		}
		return "jerkface";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
