package inClass;

import java.util.TreeSet;

class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> strings = new TreeSet<String>();
		strings.add("Evan");
		strings.add("Eugene");
		strings.add("Adam");
		
		System.out.println(strings.size());
		System.out.println(strings.first());
		System.out.println(strings.last());
		
		strings.remove("Eugene");
		
		for(String s:strings) {
			System.out.println(s);
		}
	}

}
