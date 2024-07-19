package inClass;

class Loops_Arrays {
	public static void example_1() {
		int[] values = new int[5];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = i;
			int y = values[i] * values[i];
			System.out.println(y);
		}
	}
	
	public static void example_2() {
		int[] values = new int[5];
		int i = 0;
		while(i < values.length) {
			values[i] = i;
			int y = values[i] * values[i];
			System.out.println(y);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example 1");
		example_1();
		System.out.println("Example 2");
		example_2();
	}

}
