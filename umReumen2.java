import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class umReumen2 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {


	int anzahlGang = 0;
	int anzahlKorn = 0;
    while (wegFrei()){
    	gehInGang();
    	anzahlKorn = anzahlKorn + kornZehlen();
    	anzahlGang++;
    	umDrehen();
    	seiteWechseln();
    	umDrehen();
    	anzahlKorn = anzahlKorn + kornZehlen();
    	anzahlGang++;
    	zurMitte();
    }
    int verteilBar = anzahlKorn % anzahlGang;
    int kornProGang = anzahlKorn /anzahlGang;
    umDrehen();
    
    if (kornProGang > 0){
    	if (gangKontrolle()){
    		vor();
   			for (int i = 0; i < kornProGang; i++){
   				gib();
   			}
   			umDrehen();
			seiteWechseln();
    		for ( int i = 0; i < kornProGang; i++){
    			gib();
    		}
   			umDrehen();
   			zurMitte();
   		}
   		while (wegFrei()){
   			if (gehInGang()){
   				umDrehen();
   				for (int i = 0; i < kornProGang; i++){
   					gib();
   				}
   				seiteWechseln();
   				umDrehen();
   				for (int i = 0; i < kornProGang; i++){
   					gib();
   				}
   				zurMitte();
   			}
   		}
    		
    	if (verteilBar != 0) {
    		umDrehen();
    		while (wegFrei()){
    			vor();
    		}
    		umDrehen();
    	}
    }
    if (!maulLeer()) {
    	if (gangKontrolle()){
    		vor();
    		gib();
    		umDrehen();
			seiteWechseln();
    		gib();
    		umDrehen();
    		zurMitte();
    	}
    	while (wegFrei()){
    		gehInGang();
    		if (!maulLeer()){
    			gib();
    		}
    		umDrehen();
    		seiteWechseln();
    		umDrehen();
    		if (!maulLeer()){
    			gib();
    		}
    		zurMitte();
    		if (maulLeer()){
    			while (wegFrei()){
    				vor();
    			}
    		}
    	}
    }
}

boolean wegFrei(){

	return vornFrei();
}

boolean gehInGang(){

	boolean nichtVertig = false;
	while (vornFrei()){
		vor();
		rechtsUm();
		if (vornFrei()){
			vor();
			nichtVertig = true;
		}
		else {
			linksUm();
		}
	}
	return nichtVertig;
}

int kornZehlen(){


	int korn = 0;
	while (kornDa()){
		nimm();
		korn++;
	}
	return korn;
}

void umDrehen(){


	linksUm();
	linksUm();
}

void seiteWechseln(){


	while (vornFrei()){
		vor();
	}
}

void zurMitte(){


	if (vornFrei()){
		vor();
		linksUm();
	}
}
void rechtsUm(){


	linksUm();
	linksUm();
	linksUm();
}

boolean gangKontrolle(){


	rechtsUm();
	if (vornFrei()){
		return true;
	}
	else{
		rechtsUm();
		return false;
	}
}}