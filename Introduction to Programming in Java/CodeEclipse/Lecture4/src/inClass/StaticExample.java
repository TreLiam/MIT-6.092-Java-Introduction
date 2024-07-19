package inClass;

class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby.numBabiesMade = 100;
		Baby b1 = new Baby();
		Baby b2 = new Baby();
		System.out.println(b1.numBabiesMade);
		System.out.println(b2.numBabiesMade);
		b1.numBabiesMade = 2;
		System.out.println(b1.numBabiesMade);
		System.out.println(b2.numBabiesMade);
	}

}
