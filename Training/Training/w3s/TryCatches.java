package w3s;

public class TryCatches {

	public static void main(String[] args) {

		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]); // error!
		} catch (Exception e) {
			System.out.println("java.catched - Something went wrong.");
		} finally {
			System.out.println("java.finally - Try and catch is done.");
		}
		
		int age = 21;
		alcohol(age);
			
		
		
		
	}

	private static void alcohol(int age) {
		if(age<18) {
			throw new ArithmeticException("No old enough to buy alcohol.");
		}else {
			System.out.println("Age check passed.");
		}
	}

}
