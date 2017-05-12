package autoAufgabe;

import java.util.ArrayList;

public class AngestelltenVerwaltung<X> {

	private Teammitglieder mitglied;
	private Rennstall rennStall;

	public AngestelltenVerwaltung(Teammitglieder mitglied, Rennstall rennStall) {
		super();
		this.mitglied = mitglied;
		this.rennStall = rennStall;
	}

	public AngestelltenVerwaltung() {   // TODO Auto-generated constructor stub
	}

	
	ArrayList<X> liste = new ArrayList<>();

	public void TeammitgliederHinzufügen(X mitglied) {  // Hinzufügen
		liste.add(mitglied);
	}

	public void hinzufuegen(X neuesObjekt) {      
		liste.add(neuesObjekt);
		
	}
	
	public void loeschen(X neuesObjekt) {      
		liste.remove(neuesObjekt);
		
	}

      
	public Teammitglieder getMitglied() {
		return mitglied;
	}

	public void setMitglied(Teammitglieder mitglied) {
		this.mitglied = mitglied;
	}

	public Rennstall getRennStall() {
		return rennStall;
	}

	public void setRennStall(Rennstall rennStall) {
		this.rennStall = rennStall;
	}

}
