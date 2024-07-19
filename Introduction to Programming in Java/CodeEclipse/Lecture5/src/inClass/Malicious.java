package inClass;

public class Malicious {
	static void maliciousMethod(CreditCard card) {
		//card.expenses = 0;
		//System.out.println(card.cardNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maliciousMethod(new CreditCard());
	}

}
