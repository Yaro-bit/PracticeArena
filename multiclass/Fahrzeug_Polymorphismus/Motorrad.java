package Fahrzeug_Polymorphismus;

public class Motorrad extends Fahrzeug {
	boolean helmPflicht;

	public void zeigeInfo() {
		System.out.println(
				"Motorrad: " + name + " | Geschwindigkeit: " + geschwindigkeit + " km/h | HelmPflicht:" + helmPflicht);

	}
}
