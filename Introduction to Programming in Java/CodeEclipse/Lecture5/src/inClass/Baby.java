package inClass;

public class Baby {
	int servings;
	void feed(int servings) {
		this.servings = this.servings + servings;
	}
	void poop() {
		System.out.println("All better!");
		servings = 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
