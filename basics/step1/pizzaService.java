//Bewertung: 9/10 Punkten
//
//    -1: Berechnung könnte durch Aufteilung in Methoden oder Variablen klarer strukturiert werden, 
//    um Lesbarkeit und Wartbarkeit zu verbessern.

package step1;

public class pizzaService {

	public static void main(String[] args) {
		double pizzaPrice = 11.00;
		int orderPieces = 7;
		double orderPrice = 0;
		boolean selfPickup = true;

		if (orderPieces >= 5 && selfPickup == true) {
			orderPrice = ((pizzaPrice * orderPieces) * 0.9) - (2*orderPieces);
			
		} else if (orderPieces >= 5 && selfPickup == false) {
			orderPrice = (pizzaPrice * orderPieces) * 0.9;
			
		} else if (selfPickup == true) {
			orderPrice = (pizzaPrice * orderPieces) - (2*orderPieces);
			
		} else {
			orderPrice = (pizzaPrice * orderPieces);
		}
		System.out.println("Price for your order is: " + orderPrice);
	}

}

//3. Schreibe ein Programm, das den Gesamtpreis einer Pizzabestellung berechnet.
//Berücksichtige:
//
//    10 % Rabatt ab 5 Pizzen.
//    Abzug von 2 € pro Pizza bei Selbstabholung.