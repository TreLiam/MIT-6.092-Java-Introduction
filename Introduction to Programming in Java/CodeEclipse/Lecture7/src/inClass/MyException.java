package inClass;

public class MyException extends Exception{
	public static Object get(int index) throws
		ArrayIndexOutOfBoundsException{
		if(index < 0 || index >= 99999)
			throw new
				ArrayIndexOutOfBoundsException(" "+index);
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			get(-1);
		} catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("oh dear!");
		}
	}

}
