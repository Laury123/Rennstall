package autoAufgabe;


public class Mechaniker extends Teammitglieder{
	public Mechaniker(String name, String vorname, String nationalität, int nummer,int anzahlderrennen, String spezialgebiet, int bonus,
	int anzahlreparierterautos) {
		
		super(name, vorname, nationalität, nummer, anzahlderrennen);
		Spezialgebiet = spezialgebiet;
		Anzahlreparierterautos = anzahlreparierterautos;
	}
	private String Spezialgebiet;
	private int Bonus=20000;
	public int gesamtgehalt;
	private int Anzahlreparierterautos;
	
	
	
	public int getAnzahlreparierterautos() {
		return Anzahlreparierterautos;
	}
	public void setAnzahlreparierterautos(int anzahlreparierterautos) {
		Anzahlreparierterautos = anzahlreparierterautos;
	}
	public int gesamtgehaltberechnen(){
		gesamtgehalt=Saisongehaltberechnen()+Bonus*Anzahlreparierterautos;
		return gesamtgehalt;
	}
	public int getBonus() {
		return Bonus;
	}
	public void setBonus(int bonus) {
		Bonus = bonus;
	}

}
