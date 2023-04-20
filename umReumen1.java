


import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class umReumen1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

	int anzahl = 0;
	boolean wegFrei = true;

	while (keineMauer()){	//keine sensoren in der main methode
		zumNechstenGang();
		anzahl = zehlKorn();
		seiteWechsel();
		anzahl = anzahl + zehlKorn();
		verteilen(anzahl);
		anzahl = 0;
		umDrehen();
		zurMitte();
	}	    
}

void zumNechstenGang(){

	while (vornFrei()){
		vor();
		rechtsUm();
		if (vornFrei()){
			vor();
		}
		else {
			linksUm();
		}
	}
}

void umDrehen(){

	linksUm();
	linksUm();
}

int zehlKorn(){

	int counter = 0;
	while (kornDa()){
		nimm();
		counter++;
	}
	return counter;
}

void seiteWechsel(){
	
	umDrehen();
	while (vornFrei()){
		vor();
	}
}

void verteilen(int anzahl){

	int helfte = (anzahl / 2);
	int halbierBar = (anzahl % 2);
	if (halbierBar == 0){
		for (int i = 0; i < 2; i++){
			for (int j = 0; j < helfte; j++){
				gib();
			}
			if ( i < 1){
				seiteWechsel();
			}
		}
	}
	if (halbierBar != 0) {
		if (!maulLeer()){
			gib();
		}
		for (int i = 0; i < 2; i++){
			for (int j = 0; j < helfte; j++){
				gib();
			}
			if ( i < 1){
				seiteWechsel();
			}
		}
	}
	
}

void rechtsUm(){

	linksUm();
	linksUm();
	linksUm();
}

boolean keineMauer(){
	return vornFrei();
}

void zurMitte(){

	vor();
	rechtsUm();
}}