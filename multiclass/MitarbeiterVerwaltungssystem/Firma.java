package MitarbeiterVerwaltungssystem;

import java.util.ArrayList;
import java.util.List;

public class Firma {

	public List<Mitarbeiter> m;

	public Firma() {
		this.m = new ArrayList<>();
	}

	public void mitarbeiterHinzufügen(Mitarbeiter ma) {
		m.add(ma);
	}

	public void zeigeMitarbeiter() {
		for (Mitarbeiter mitarbeiter : m) {
			if (mitarbeiter instanceof Manager) {
				Manager manager = (Manager) mitarbeiter;
				
				System.out.println(
						"\n"+
						" Name:"+manager.getName()+"\n"+
						" Alter:"+manager.getAlter()+"\n"+
						" Gehalt:"+manager.getGehalt()+"\n"+
						" Bonus:"+manager.berechneBonus()+"\n"+
						" Gesantgehalt:"+(manager.berechneBonus()+manager.getGehalt())+"\n"+
						" Abteilung:"+(manager.getAbteilung())
						);
			}
			else if (mitarbeiter instanceof Entwickler) {
				Entwickler entwickler = (Entwickler) mitarbeiter;
				
				System.out.println(
						"\n"+
						" Name:"+entwickler.getName()+"\n"+
						" Alter:"+entwickler.getAlter()+"\n"+
						" Gehalt:"+entwickler.getGehalt()+"\n"+
						" Bonus:"+entwickler.berechneBonus()+"\n"+
						" Gesantgehalt:"+(entwickler.berechneBonus()+entwickler.getGehalt())+"\n"+
						" Programmiersprache:"+(entwickler.getProgrammiersprache())
						);
				
			}else {
				System.out.println( "error on zeigeMitarbeiter(), case nicht bberücksichtigt");
			}
		}
	}
}
//Klasse Firma
//Enthält eine Liste von Mitarbeitern (Verwendung von ArrayList<Mitarbeiter>)
//Methoden:
//    mitarbeiterHinzufügen(Mitarbeiter m): Fügt einen Mitarbeiter zur Liste hinzu.
//    zeigeMitarbeiter(): Gibt alle Mitarbeiter mit deren Details und Bonus aus.
