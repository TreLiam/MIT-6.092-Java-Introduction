package inClass;

class NewLine {
	public static void newline() {
		System.out.println("");
	}
	
	public static void threeLines() {
		newline(); newline(); newline();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line1");
		threeLines();
		System.out.println("Line2");
	}

}
