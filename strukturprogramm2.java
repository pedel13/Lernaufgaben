import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class strukturprogramm2 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    
    int wegZehler = 0;
    int arrayPosition = 0;
    int[] strecke = new int[3];
    while (vornFrei()){
    	if (kornDa()){
    		linksUm();
    		linksUm();
    		linksUm();
    		nimm();
    		strecke[arrayPosition] = wegZehler;
    		arrayPosition++;
    		wegZehler = 0;
    		if (kornDa()){
    			nimm();
    			break;
    		}
    	}
    	else  {
    		vor();
    		wegZehler++;
    	}
    }
    linksUm();
    linksUm();
    linksUm();
    for (i = strecke.length; i >= 0; i--){
    	for (int j = 0; j < strecke[i] ;j++){
    	vor();
    	}
    	linksUm();
    }
    linksUm();
}
}