package inClass;

public class GrandWizard extends Wizard{
	public void sayName() {
		System.out.println("Grand wizard " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dude dude1 = new Dude();
		
		GrandWizard grandWizard1 = new GrandWizard();
		grandWizard1.name = "Flash";
		
		grandWizard1.sayName();
		((Dude)grandWizard1).sayName();
		grandWizard1.punchFace(dude1);
	}

}
