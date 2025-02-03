package Fahrzeug_Polymorphismus;

abstract class Fahrzeug {
	String name;
	int geschwindigkeit;

	public int beschleunigen(int wert) {
		geschwindigkeit = geschwindigkeit + wert;
		return geschwindigkeit;
	}

	public int bremsen(int wert) {
		geschwindigkeit = geschwindigkeit - wert;
		if (geschwindigkeit < 0) {
			geschwindigkeit = 0;
		}
		return geschwindigkeit;
	}

	public abstract void zeigeInfo();

}
