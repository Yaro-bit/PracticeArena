//Bewertung: 9.5/10 Punkten
//-0.5: Die Berechnung von step innerhalb der Schleife ist korrekt, aber es wäre sinnvoll, den Algorithmus durch Kommentare 
//oder eine kurze Erklärung klarer zu machen, da die Logik auf den ersten Blick nicht sofort verständlich ist.

package step1;
public class loopWithSteps {

	public static void main(String[] args) {
		int step = 1;
		for(int i = 1; i<60; i=i+step) {
			step=step+1;
			System.out.println("i: "+i+" and step: "+step);
		}
	}
}

//6. Schreibe ein Programm, das eine Schleife mit einem dynamischen Schrittwert ausführt. 
//Der Schrittwert beginnt bei 1 und erhöht sich nach jeder Iteration um 1. 
//Gib in jeder Iteration den aktuellen Wert und den Schrittwert aus.