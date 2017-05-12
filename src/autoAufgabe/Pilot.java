package autoAufgabe;

public class Pilot extends Teammitglieder {

private int Nummer;
private int AnzahlSiege;
public int Gehalt;
public int Bonus=50000;


public Pilot(String name, String vorname, String nationalität, int nummer,
		int Anzahlderrennen, int anzahlSiege) {
	super(name, vorname, nationalität, nummer, Anzahlderrennen);
	Nummer = nummer;
	AnzahlSiege = anzahlSiege;
}

public int gehaltberechnen(){
	Gehalt=Saisongehaltberechnen()+Bonus*AnzahlSiege;
	return Gehalt;
}


public int getNummer() {
	return Nummer;
}
public void setNummer(int nummer) {
	Nummer = nummer;
}
public int getAnzahlSiege() {
	return AnzahlSiege;
}
public void setAnzahlSiege(int anzahlSiege) {
	AnzahlSiege = anzahlSiege;
}

}
