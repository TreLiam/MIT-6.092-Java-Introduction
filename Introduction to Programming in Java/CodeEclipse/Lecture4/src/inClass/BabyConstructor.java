package inClass;

public class BabyConstructor {
	String name = "Slim Shady";
	boolean isMale;
	
	BabyConstructor(String myname, boolean maleBaby){
		name = myname;
		isMale = maleBaby;
	}
	
	void sayHi() {
		System.out.println("Hi, my name is " + name);
	}
}
