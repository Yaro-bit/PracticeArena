//Bewertung: 8.5/10 Punkten
//-1.5: Der Highscore (actualHighscore) wird nur lokal in der Methode geändert. Dies hat keinen Einfluss auf den Highscore außerhalb der Methode. 
//Um dies zu verbessern, könnte man den neuen Highscore zurückgeben oder eine globale Variable verwenden.

package step1;

public class highscoreChecker {

	public static void main(String[] args) {
		highscore(120, 100);

	}

	private static void highscore(int playerScore, int actualHighscore) {
		if (playerScore >= actualHighscore) {
			actualHighscore = playerScore;
			System.out.println("Congratulations, this is new highscore");
		}
	}
}


//2. Schreibe ein Programm, das überprüft, 
//ob ein Spielerscore einen bestehenden Highscore übertrifft, und eine entsprechende Nachricht ausgibt.