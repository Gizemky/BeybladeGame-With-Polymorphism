
public class Dranza extends Beyblade{
	
	
	private String sacred_beast;

public Dranza(String beyblade_gamer_name, int rotational_speed, int attack_strength, String sacred_beast) {
	
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
	System.out.println(getBeyblade_gamer_name() + " 's Attack : Flame Sword ");
	
}


@Override
public void show_information() {
	
	super.show_information();
	System.out.println("Sacred beast name : " + sacred_beast );
	
}




	

	
	

}
