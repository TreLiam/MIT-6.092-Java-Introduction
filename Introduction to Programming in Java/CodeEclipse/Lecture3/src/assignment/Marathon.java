package assignment;

class Marathon {

	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", 
				"Emma", "John", "James","Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 
				334, 412, 393, 299, 343, 317, 265 };

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		String first = null, second = null;

		for (int i = 0; i < names.length; i++) {
			if (times[i] < min2) {
				if (times[i] < min1) {
					min1 = times[i];
					first = names[i];
				} else {
					min2 = times[i];
					second = names[i];
				}
			}
		}
		System.out.println(first + ":" + min1);
		System.out.println(second + ":" + min2);
	}

}
