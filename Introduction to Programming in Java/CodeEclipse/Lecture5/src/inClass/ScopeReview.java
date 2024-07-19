package inClass;

public class ScopeReview {
	private int var3 = 0;
	
	void scopeMethod(int var1) {
		var3 = var1;
		String var2;
		if(var1 > 0) {
			var2 = "above 0";
		}else {
			var2 = "less than or equal to 0";
		}
		System.out.println(var2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ScopeReview().scopeMethod(10);
	}

}
