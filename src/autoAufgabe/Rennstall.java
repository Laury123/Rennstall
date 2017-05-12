package autoAufgabe;


public class Rennstall {

private String teamname;
private String Sponsor;
private int Anzahlteammitglieder;
private int Anzahlrennwagen;
private int countRennwagen=0;
private int countTeammitglieder=0 ;

private AngestelltenVerwaltung<Rennwagen> rennwagen;
private AngestelltenVerwaltung<Teammitglieder> teammitglieder;


    public Rennstall(String teamname, String sponsor, int anzahlteammitglieder, int anzahlrennwagen) {
	this.teamname = teamname;
	     Sponsor = sponsor;
	     Anzahlteammitglieder = anzahlteammitglieder;
	     Anzahlrennwagen = anzahlrennwagen;
	
	this.rennwagen = new AngestelltenVerwaltung<Rennwagen>();
	this.teammitglieder = new AngestelltenVerwaltung<Teammitglieder>();
}

	public static void main(String[] args) {  // TODO Auto-generated method stub
		
		Mechaniker lary=new Mechaniker("Ralf", "Müller", "russisch",12,5,"Reifen",3,8);
		System.out.println(lary.gesamtgehaltberechnen());
		
		Pilot Ali=new Pilot("Emanuel","Slaby","deutsch",1,8,9);
		System.out.println(Ali.gehaltberechnen());
		
		Rennwagen CarJonas=new Rennwagen(true,null); 
	}
	
	public boolean addRennwagen(Rennwagen rennwagen){
		if(countRennwagen < Anzahlrennwagen){
			this.rennwagen.hinzufuegen(rennwagen);
			this.countRennwagen++;
		return true;
		}
	
		return false;
	} 
	public boolean addTeammitglieder(Teammitglieder teammitglieder){
		
		if(countTeammitglieder < Anzahlteammitglieder){
			this.teammitglieder.hinzufuegen(teammitglieder);
			this.countTeammitglieder++;
		return true; 
		}
		
		return false;
		
		}
	
	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getSponsor() {
		return Sponsor;
	}

	public void setSponsor(String sponsor) {
		Sponsor = sponsor;
	}

	public int getAnzahlteammitglieder() {
		return Anzahlteammitglieder;
	}

	public void setAnzahlteammitglieder(int anzahlteammitglieder) {
		Anzahlteammitglieder = anzahlteammitglieder;
	}

	public int getAnzahlrennwagen() {
		return Anzahlrennwagen;
	}

	public void setAnzahlrennwagen(int anzahlrennwagen) {
		Anzahlrennwagen = anzahlrennwagen;
	}

}
