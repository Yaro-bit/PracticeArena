package basics;



public class BasicFizzBuzzGame {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");

			} else if (i % 3 == 0) {
				System.out.println("Fizz");

			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);

			}
		}

	}

}
//Aufgabe: FizzBuzz
//
//Schreibe ein Programm in Java, das die Zahlen von 1 bis 100 ausgibt, aber mit den folgenden Regeln:
//
//    Wenn die Zahl durch 3 teilbar ist, gib statt der Zahl Fizz aus.
//    Wenn die Zahl durch 5 teilbar ist, gib statt der Zahl Buzz aus.
//    Wenn die Zahl durch 3 und 5 teilbar ist, gib FizzBuzz aus.
//    Für alle anderen Zahlen gib die Zahl selbst aus.
