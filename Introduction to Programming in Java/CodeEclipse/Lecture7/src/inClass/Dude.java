package inClass;

public class Dude {
	public String name;
	public int hp = 100;
	public int mp = 0;
	
	public void sayName() {
		System.out.println(name);
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void punchFace(Dude target) {
		target.hp -= 10;
		System.out.println(target.name + " Ooch!");
	}
}
