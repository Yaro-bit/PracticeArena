
//Bewertung: 9/10 Punkten
//
//    -1: Der Code könnte durch bessere Variablennamen (z. B. boxes, capacityPerTruck, totalRides) an Lesbarkeit gewinnen.


package step1;

public class mathCalculations {

	public static void main(String[] args) {
		int box = 1000;
		int truck = 75;
		int ride = 0;
		
		if(box%truck!=0) {
			 ride = (box/truck)+1;
		}else {
			ride = (box/truck);
		}
		
		
		System.out.println("How many rides we need to transport all the boxes: "+ride);
	}

}

//1. Schreibe ein Programm, das berechnet, wie viele Fahrten ein LKW benötigt, um alle Kisten zu transportieren, 
//wobei die Anzahl der Kisten und die Kapazität des LKW gegeben sind.