package autoAufgabe;

public class Rennwagen {
	public Rennwagen(boolean zustand, Pilot zugeordneterPilot) {
		super();
		Zustand = zustand;
		this.zugeordneterPilot = zugeordneterPilot;
		Wagennummer++;
	}
	private static int Wagennummer=1;
	private boolean Zustand;
	private Pilot zugeordneterPilot;
	
	
	public boolean isZustand() {
		return Zustand;
	}
	public void setZustand(boolean zustand) {
		Zustand = zustand;
	}
	public Pilot getZugeordneterPilot() {
		return zugeordneterPilot;
	}
	public void setZugeordneterPilot(Pilot zugeordneterPilot) {
		this.zugeordneterPilot = zugeordneterPilot;
	}

}
