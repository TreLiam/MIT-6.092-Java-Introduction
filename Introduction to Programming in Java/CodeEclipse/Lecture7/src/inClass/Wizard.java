package inClass;

public class Wizard extends Dude{
	
	public static void main(String[] args) {
		Wizard wizard1 = new Wizard();
		Dude dude1 = new Dude();
		
		wizard1.hp += 1;
		wizard1.punchFace(dude1);
		dude1.punchFace(wizard1);
		
		wizard1.sayName();
	}
}
