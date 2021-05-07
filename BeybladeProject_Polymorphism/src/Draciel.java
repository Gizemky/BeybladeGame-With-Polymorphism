
public class Draciel extends Beyblade {

	private String sacred_beast;
	
public Draciel(String beyblade_gamer_name, int rotational_speed, int attack_strength,String sacred_beast) {
		
   super(beyblade_gamer_name, rotational_speed, attack_strength);
   this.sacred_beast = sacred_beast;
	}

public String getSacred_beast() {
	return sacred_beast;
}

public void setSacred_beast(String sacred_beast) {
	this.sacred_beast = sacred_beast;
}

@Override
public void sacred_beast() {
	System.out.println(getBeyblade_gamer_name() + " reveals the " + sacred_beast);
	System.out.println(getBeyblade_gamer_name() + " 's Attack : Castle Defense ");
	
}

@Override
public void show_information() {
	
	super.show_information();
	System.out.println("Sacred beast name : " + sacred_beast );
}



}
