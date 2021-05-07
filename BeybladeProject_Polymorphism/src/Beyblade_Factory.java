
public class Beyblade_Factory {
	
	public Beyblade produce_beyblade (String beyblade_type ) {
		
		if (beyblade_type.equals("Dragon")) {
			
			return new Dragon("Takao", 800 , 500 , "Blue Dragon", "Talking to the sacred beast.");
		}
		
		else if (beyblade_type.equals("Dranza")) {
			
			return new Dranza("Kai", 600 , 400 , "Red Phoenix");
			
		}
		
        else if (beyblade_type.equals("Dragon")) {
			
        	return new Dranza("Rei", 900 , 300 , "White Tiger");
			
		}
		
       else if (beyblade_type.equals("Draciel")) {
    	   
    	   return new Dranza("Max", 300 , 1000 , "Black Turtle");
			
		}
		
       else {
    	   
    	   return null;
       }
		
	}

}
