package Fahrzeug_Polymorphismus;

public class Auto extends Fahrzeug {
	int anzahlTueren;

	public void zeigeInfo() {
		System.out
				.println("Auto: " + name + " | Geschwindigkeit: " + geschwindigkeit + " km/h | Türen:" + anzahlTueren);

	}
}
