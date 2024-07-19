package inClass;

public class MethodsAndReferences {
	void doSomething(int x, int[] ys, BabyConstructor b) {
		x = 99;
		ys[0] = 99;
		b.name = "99";
	}
	
	 void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] j = {0};
		BabyConstructor k = new BabyConstructor("50", true);
		doSomething(i, j, k);
		
	}

}
