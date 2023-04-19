import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class umReumen1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {

	boolean wegFrei = true;
	int anzahl = 0;
	while (wegFrei){	//keine sensoren in der main methode
		zumNechstenGang();
		anZahlKorn(anzahl);
		anzahl = 0;
		zurMitte();
		keineMauer(wegFrei);
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

void anZahlKorn(int anzahl){

	while (kornDa()){	//untere nische
		nimm();
		anzahl++;
	}
	seiteWechsel();
	while (kornDa()){	//obere Nische
		nimm();
		anzahl++;
	}
	verteilen(anzahl);
}

void seiteWechsel(){
	
	umDrehen();
	while (vornFrei()){
		vor();
	}
	umDrehen();
}

void verteilen(int anzahl){

	int helfte = (anzahl / 2);
	int halbierBar = (anzahl % 2);
	if (halbierBar == 0){
		for (int i = 0; i < 2; i++){
			for (int j = 0; j < helfte; j++){
				gib();
			}
			seiteWechsel();
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
		seitenWeksel();
		}
	}
	
}

void rechtsUm(){

	linksUm();
	linksUm();
	linksUm();
}

void keineMauer(boolean wegFrei){

	if (vornFrei()){
		wegFrei = true;
	}
	else {
		wegFrei = false;
	}
}

void zurMitte(){

	vor();
	rechtsUm();
}}