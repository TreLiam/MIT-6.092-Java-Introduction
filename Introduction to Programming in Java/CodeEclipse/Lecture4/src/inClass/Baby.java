package inClass;

public class Baby {
	String name = "DMX";
	boolean isMale;
	double weight = 5.0;
	double decibels;
	int numPoops = 0;
	static int numBabiesMade = 0;
	Baby[] siblings;
	
	Baby(){
		numBabiesMade += 1;
	}
	
	Baby(String myname, boolean maleBaby){
		name = myname;
		isMale = maleBaby;
		numBabiesMade += 1;
	}
	
	void poop() {
		numPoops += 1;
		System.out.println("Dear mother, " + 
		"I have pooped. Ready the diaper.");
	}
	
	void sayHi() {
		System.out.println("Hi, my name is " + name);
	}
	
	void eat(double foodWeight) {
		if(foodWeight >= 0 && foodWeight < weight) {
			weight = weight + foodWeight;
		}
	}
	
	public static void printnum() {
		System.out.println(numBabiesMade);
	}
	
	public static void main(String[] args) {
		Baby b1 = new Baby();
		Baby.printnum();
		Baby b2 = new Baby("50", true);
		Baby.printnum();
		Baby.numBabiesMade = 100;
		Baby.printnum();
	}
}
