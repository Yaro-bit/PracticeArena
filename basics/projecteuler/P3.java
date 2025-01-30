package projecteuler;

import java.math.BigInteger;

public class P3 {

    public static void main(String[] args) {
        BigInteger number = new BigInteger("600851475143600851475143");
        BigInteger largestPrime = BigInteger.TWO;

        for (BigInteger i = BigInteger.TWO; i.compareTo(number.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
            while (number.mod(i).equals(BigInteger.ZERO)) {
                largestPrime = i;
                number = number.divide(i);
            }
        }

        if (number.compareTo(BigInteger.ONE) > 0) {
            largestPrime = number;
        }

        System.out.println("Primfaktor: " + largestPrime);
    }
}

//Die Aufgabe verlangt nach dem größten Primfaktor der Zahl 600851475143600851475143. Ein Primfaktor ist eine Zahl, 
//die nur durch 1 und sich selbst teilbar ist und die eine Zahl teilt. Um die Aufgabe zu lösen, 
//musst du die Zahl 600851475143600851475143 in ihre Primfaktoren zerlegen und den größten davon finden.
//
//Schritte:
//    Teile die Zahl durch kleinere Primzahlen, wie 2, 3, 5, 7, 11, 13 usw., und überprüfe, ob sie ein Teiler sind.
//    Wenn eine Zahl einen Teiler hat, teile die Zahl durch diesen Teiler und fahre fort, bis du keine weiteren Teiler findest,
// 	  die kleiner sind als die Zahl selbst.
//    Der größte verbleibende Teiler, wenn du nicht weiter teilen kannst, ist der größte Primfaktor.
//
//Nötige Daten:
//    Die Zahl, die du zerlegen musst: 600851475143600851475143.
//    Primzahlen, die du prüfen musst: Du startest mit den kleineren Primzahlen wie 2, 3, 5, 7 usw.
