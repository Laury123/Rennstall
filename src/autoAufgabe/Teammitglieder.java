package autoAufgabe;

public abstract class Teammitglieder {
	public Teammitglieder(String name, String vorname, String nationalität, int nummer,int Anzahlderrennen) {
		this.name = name;
		this.vorname = vorname;
		Nationalität = nationalität;
		this.nummer = nummer;
		this.Anzahlderrennen=Anzahlderrennen;
	}
	
	private String name;
	private String vorname;
	private String Nationalität;
	private int nummer;
	public int saisongehalt;
	private int Anzahlderrennen;
	protected int renngehalt;
	
	
	public int Saisongehaltberechnen(){
		saisongehalt=Anzahlderrennen*renngehalt;
		return saisongehalt;
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNationalität() {
		return Nationalität;
	}
	public void setNationalität(String nationalität) {
		Nationalität = nationalität;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getAnzahlderrennen() {
		return Anzahlderrennen;
	}

	public void setAnzahlderrennen(int anzahlderrennen) {
		Anzahlderrennen = anzahlderrennen;
	}
}