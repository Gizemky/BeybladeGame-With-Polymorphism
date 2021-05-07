
public class Beyblade {
	
	private String beyblade_gamer_name;
	private int rotational_speed;
	private int attack_strength;

public Beyblade(String beyblade_gamer_name, int rotational_speed, int attack_strength) {
		
	this.beyblade_gamer_name = beyblade_gamer_name;
	this.rotational_speed = rotational_speed;
	this.attack_strength = attack_strength;
	}

public String getBeyblade_gamer_name() {
	return beyblade_gamer_name;
}

public void setBeyblade_gamer_name(String beyblade_gamer_name) {
	this.beyblade_gamer_name = beyblade_gamer_name;
}

public int getRotational_speed() {
	return rotational_speed;
}

public void setRotational_speed(int rotational_speed) {
	this.rotational_speed = rotational_speed;
}

public int getAttack_strength() {
	return attack_strength;
}

public void setAttack_strength(int attack_strength) {
	this.attack_strength = attack_strength;
}


public void attack() {
	
	System.out.println(beyblade_gamer_name  + " attacks with " + attack_strength  + " and "  + rotational_speed );
}

public void sacred_beast () {
	
	System.out.println("This beyblade has no sacred beast...");
}

public void show_information () {
	
	System.out.println("Gamer Name : " + beyblade_gamer_name );
	System.out.println("Rotational Speed : " + rotational_speed );
	System.out.println("Attack Strength : " + attack_strength );
}

}
