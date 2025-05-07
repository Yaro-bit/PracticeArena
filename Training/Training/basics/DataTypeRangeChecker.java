package basics;

import java.io.InputStream;
import java.util.Scanner;

public class DataTypeRangeChecker {

	public static void main(String[] args) {

		boolean shutdown = false;
		Scanner scan = new Scanner(System.in);
		while (!shutdown) {

			byteTest(scan);
			shortTest(scan);
			intTest(scan);
			longTest(scan);
			floatTest(scan);
			doubleTest(scan);
			charTest(scan);
			booleanTest(scan);

			// Exit
			System.out.print("Exit ? Y/N: ");
			String input = scan.nextLine();
			if (input.equals("Y")) {
				shutdown = true;
			} else if (input.equals("N")) {
			} else {
				System.out.println("Wrong entry \nRetry ? Y/N");
				input = scan.nextLine();
			}
			
			
		}

	}

	private static void booleanTest(Scanner scan) {
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter valid boolean value:");
		userIn = scan.nextLine();
		if (userIn.equals("true")) {
			System.out.println("Success !");
			System.out.println("*************************************");
		} else if (userIn.equals("false")) {
			System.out.println("Success !");
			System.out.println("*************************************");
		} else {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			booleanTest(scan);
		}
	}

	private static void charTest(Scanner scan) {
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter valid char value:");
		userIn = scan.nextLine();
		if (userIn.length() == 1) {
			System.out.println("Success !");
			System.out.println("*************************************");
		} else {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			charTest(scan);
		}

	}

	private static void byteTest(Scanner scan) {
		byte bmax = 127;
		byte bmin = -128;
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter byte max value:");
		userIn = scan.nextLine();
		while (Integer.valueOf(userIn) != bmax) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter byte max value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
		System.out.print("Please enter byte min value:");
		userIn = scan.nextLine();
		while (Integer.valueOf(userIn) != bmin) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter byte min value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
	}

	private static void shortTest(Scanner scan) {
		short smax = 32767;
		short smin = -32768;
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter short max value:");
		userIn = scan.nextLine();
		while (Integer.valueOf(userIn) != smax) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please short byte max value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
		System.out.print("Please enter short min value:");
		userIn = scan.nextLine();
		while (Integer.valueOf(userIn) != smin) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter short min value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
	}

	private static void intTest(Scanner scan) {
		int imax = 2147483647;
		int imin = -2147483648;
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter int max value:");
		userIn = scan.nextLine();
		while (Integer.valueOf(userIn) != imax) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter int max value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
		System.out.print("Please enter int min value:");
		userIn = scan.nextLine();
		while (Integer.valueOf(userIn) != imin) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter int min value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
	}

	private static void longTest(Scanner scan) {
		long lmax = Long.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter long max value:");
		userIn = scan.nextLine();
		while (Long.valueOf(userIn) != lmax) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter long max value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
		System.out.print("Please enter long min value:");
		userIn = scan.nextLine();
		while (Long.valueOf(userIn) != lmin) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter long min value:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
	}

	private static void floatTest(Scanner scan) {
		;
		int floatDecimalPlaces = 7;
		int floatDecimalPlaces2 = 6;
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter max decimal places for float:");
		userIn = scan.nextLine();

		while ((Integer.valueOf(userIn) != floatDecimalPlaces) && (Integer.valueOf(userIn) != floatDecimalPlaces2)) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter max decimal places for float:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
	}

	private static void doubleTest(Scanner scan) {
		int doubleDecimalPlaces = 15;
		int doubleDecimalPlaces2 = 16;
		String userIn;
		System.out.println("*************************************");
		System.out.print("Please enter max decimal places for double:");
		userIn = scan.nextLine();
		while ((Integer.valueOf(userIn) != doubleDecimalPlaces) && (Integer.valueOf(userIn) != doubleDecimalPlaces2)) {
			System.out.println("WRONG !");
			System.out.println("*************************************");
			System.out.print("Please enter max decimal places for double:");
			userIn = scan.nextLine();
		}
		System.out.println("Success !");
		System.out.println("*************************************");
	}

}
