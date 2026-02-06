package hospital2;

public class Pacient extends Persona {
	double sou;
	int anysTreballats;
	int edat;
	
	public Pacient(String nom, int edat) {
		super(nom);
		this.edat = edat;
		this.sou = 1000;
		this.anysTreballats = 0;
	}

}
