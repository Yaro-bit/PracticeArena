package projecteuler;

public class P2 {

	public static void main(String[] args) {
		
		int zahl1 = 1;
		int zahl2 = 2;
		int zwZahl = 0;
		int fibo = 0;
		int sum = 0;
		
		do {
			fibo = zahl1 + zahl2;
			zwZahl = zahl2;
			zahl1 = zwZahl;
			zahl2 = fibo;
				if(fibo%2==0) {
					sum = sum + fibo;
				}
		} while(fibo<4000000);
		
		System.out.println(sum);
		
	}
}

//Aufgabe:
//Schreibe ein Programm, das die Fibonacci-Zahlen(Reihe von Zahlen, bei denen jede Zahl die Summe der beiden vorherigen Zahlen ist) 
//berechnet, bis der Wert 4 Millionen überschritten wird. Addiere nur die geraden Fibonacci-Zahlen und gib das Ergebnis aus.
