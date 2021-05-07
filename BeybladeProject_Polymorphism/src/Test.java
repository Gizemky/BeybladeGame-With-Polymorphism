import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the game..");
		
		System.out.println("Exit : q");
		
		Scanner scanner = new Scanner (System.in);
		

		
while (true) {
	
	System.out.println("Choose Beyblade : ");
	String beyblade_name  = scanner.nextLine();
	
	if (beyblade_name.equals("q")) {
		
		
		System.out.println("Exiting the program");
		
	}
	
   else {
	   
	   Beyblade_Factory  beyblade_factory = new Beyblade_Factory();
	   
	   Beyblade beyblade = beyblade_factory.produce_beyblade(beyblade_name);
	  
	   if (beyblade == null) {
		   
		   System.out.println("Please enter a valid value.");
		   
	   }
	   
	   else {
		   
		   beyblade.show_information();
		   beyblade.attack();
		   beyblade.sacred_beast();
	   }
	
}
}

	}

}
