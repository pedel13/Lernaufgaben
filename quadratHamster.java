import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class quadratHamster extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    
    int seite = 0;
    while (kornDa()){
    	nimm();
    	seite++;
    }
    for (int i = 0;i < 4;i++){
    	for (int j = 1;j < seite;j++){
    		gib();
    		vor();    	
    	}
    	linksUm();
    }
}
}