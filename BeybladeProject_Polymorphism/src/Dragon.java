
public class Dragon extends Beyblade {

	private String sacred_beast;
	private String secret_talent;
	
public Dragon (String beyblade_gamer_name, int rotational_speed, int attack_strength,String sacred_beast,String secret_talent) {

	super(beyblade_gamer_name, rotational_speed, attack_strength);
	this.sacred_beast = sacred_beast;
	this.secret_talent = secret_talent;
	
	
	}

public String getSacred_beast() {
	return sacred_beast;
	
	
}

public void setSacred_beast(String sacred_beast) {
	this.sacred_beast = sacred_beast;
}


public String getSecret_talent() {
	return secret_talent;
}

public void setSecret_talent(String secret_talent) {
	this.secret_talent = secret_talent;
}

@Override
public void sacred_beast() {
	
	System.out.println(getBeyblade_gamer_name() + " reveals the " + sacred_beast);
	System.out.println(getBeyblade_gamer_name() + " 's Attack : Ghost Hurricane");
	
}

@Override
public void show_information() {
	
	super.show_information();
	System.out.println("Sacred beast name : " + sacred_beast );
	System.out.println("Secret talent : " + secret_talent );
}


}

