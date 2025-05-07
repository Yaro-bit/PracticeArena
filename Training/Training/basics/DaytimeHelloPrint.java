package basics;




//8/10 Punkten
//
//    -1: Veraltete Klassen (SimpleDateFormat, Date) statt moderner Alternativen wie LocalTime.
//    -0.5: Try-Catch für aktuelle Uhrzeit unnötig.
//    -0.5: Kleinere Lesbarkeitsprobleme (Bedingungen, Klassennamen).
//


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DaytimeHelloPrint {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat time = new SimpleDateFormat("HH:mm");
		Date m = time.parse("11:59");
		Date nm = time.parse("17:59");
		Date a = time.parse("22:59");
		Date n = time.parse("04:59");
        
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
        LocalDateTime now = LocalDateTime.now();   
		String actualTime =  dtf.format(now); 
		
		try {
			Date userDate = time.parse(actualTime);
			if (userDate.after(n) && userDate.before(m)) {
				System.out.println("Guten Morgen");
			}
			else if(userDate.after(m) && userDate.before(nm)) {
				System.out.println("Guten Tag");
			}
			else if(userDate.after(nm) && userDate.before(a)) {
				System.out.println("Guten Abend");
			}
			else if(userDate.after(a) || userDate.before(m) ) { //  || weil sonst der nechste tag genommen wird 
				System.out.println("Gute Nacht");
			}
		} catch (ParseException e) {
			System.out.println("Ungültiger Wert");
		}

	}

}

//1. Einführung: Begrüßung basierend auf der Tageszeit
//
//Schreibe ein Programm, das die aktuelle Uhrzeit überprüft und basierend auf der Tageszeit eine Begrüßung ausgibt:
//
//    Morgen: 5:00–11:59
//    Nachmittag: 12:00–17:59
//    Abend: 18:00–22:59
//    Nacht: 23:00–4:59
//
//Themen: Bedingte Anweisungen, Variablen, Ausgabe