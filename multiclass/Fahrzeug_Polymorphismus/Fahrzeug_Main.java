
//Etwas mehr Datenkapselung & eine Liste für besseren Polymorphismus 🔧
//Kleine Verbesserungen wie @Override, Getter/Setter & getClass().getSimpleName() 🎯

package Fahrzeug_Polymorphismus;

public class Fahrzeug_Main {
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		Motorrad meinMotorrad= new Motorrad();
		
		meinAuto.name = "BMW";
		meinMotorrad.name = "Yamaha";
		
		meinAuto.geschwindigkeit = 50;
		meinMotorrad.geschwindigkeit = 50;
		
		meinAuto.anzahlTueren = 5;
		meinMotorrad.helmPflicht = true;
		
		meinAuto.beschleunigen(20);
		meinMotorrad.beschleunigen(30);
		
		meinMotorrad.zeigeInfo();
		meinAuto.zeigeInfo();
		
	}
}
