package assignment;

class fooCorporation {
	public static boolean judge(double BasePay, int HoursWorked) {
		if(BasePay < 8 || HoursWorked > 60) return false;
		else return true;
	}
	
	public static double salary(double BasePay, int HoursWorked) {
		if(HoursWorked <= 40) return BasePay * HoursWorked;
		else return 40 * BasePay + (HoursWorked - 40) * 1.5 * BasePay;
	}
	
	public static void caculator(double BasePay, int HoursWorked) {
		if(judge(BasePay, HoursWorked)) System.out.println(salary(BasePay, HoursWorked));
		else System.out.println("error");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caculator(7.50, 35);
		caculator(8.20, 47);
		caculator(10.00, 73);
	}	

}
