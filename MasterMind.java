import java.util.Scanner;
import java.util.Random;

public class MasterMind {

	public static void main(String[] args) {

		
		Spel spel = new Spel();
		spel.spelen();

	}
}


class Spel{
	static void spelen() {
		char[] poging = new char[4];
		System.out.println("Welkom bij MasterMind");
		System.out.println("");
		System.out.println("Door Koevoets development.");
		System.out.println("");
		System.out.println("De computer selecteert nu een geheime code die u mag raden, u heeft een obeperkt aantal pogingen om de code te raden.");
		System.out.println("De code bestaat uit 4 kleine letters van a t/m f, om de code te raden voert u\n4 van deze letters in zonder spatie, gevolgd door Enter (letters mogen meermaals gebruikt worden). ");
		System.out.println("Een voorbeeld van uw invoer is: ffab Enter.");
		System.out.println("Is de code (nog) niet correct, dan geeft de computer aan hoeveel letters correct zijn en\nop de goede plek staan en hoeveel van de letters goed zijn, maar níet op de goede plek staan.");
		System.out.println("Voer q in gevolgd door Enter om het spel te beëidigen.");
		System.out.println("");

		Letter[] coderesult = new Letter[4];
		GeheimeCode code = new GeheimeCode();
		coderesult = code.maakCode();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		int c=0;
		while(c<4) {		
		
			System.out.println("Geef uw invoer (een q of 4 letters van a t/m f gevolgd door Enter:)");
			String invoer = sc.nextLine();
			if(invoer.equals("q")){
			
				System.out.println("U heeft ervoor gekozen het spel te beëindigen");
				System.exit(0);
			    
			}else if (invoer.length() != 4) {
										
			}else { 
				
				
				for (int k=0;k<4;k++) { 
						
					poging[k]=invoer.charAt(k);
					if (poging[k] >= 'a' && poging[k] <= 'f') {
						
						c++;
					
					}
				}
			}
		}
		int sco = 0;
		
		
		// hier poging en coderesult vergelijken, bij gelijke plaats 10 bij score optellen, bij niet op zelfde plek 1
		// ik ben wat te laat begonnen (zondagochtend) dus heb het niet af gekregen. Deze week begin ik al op woensdag met de weekopdracht.

	
		
		
		
		if (sco>34) {
			
			System.out.println("Gefeliciteerd! U heeft de geheime code geraden! Bedankt voor het spelen.");
			System.exit(0);
						
		}else {
			System.out.println("Van de door u gegeven letters staan er "+sco/10+" op de juiste plaats. "+(sco-((sco/10)*10))+" letters zijn wel goed, maar staan niet op de juiste plaats.");
		}
		}
	}	
}


class GeheimeCode{
	
	Letter[] maakCode() {
				
		Letter[] letters = new Letter[4];
				
		for(int i = 0; i < 4 ; i++){
		    letters[i] = new Letter();
		    
		}return letters;
	}
	
}

class Letter{

	Random r = new Random();
	char c = (char)(r.nextInt(6) + 'a');

}
