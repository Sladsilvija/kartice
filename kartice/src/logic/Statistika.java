package logic;

 import java.util.List;

import kartice.Kartica;

 
public class Statistika {
	
	public static double racunajLitre(List<Kartica>listaKartica) {
		
		double ukupnoLitara=0;
				
	    for(Kartica k : listaKartica ) {
	    	ukupnoLitara += k.getSipanoLitara();
	    }
				
		return ukupnoLitara;
	}
	
	
    public static double extraPoeni(List<Kartica >listaKartica) {
	
    double extraPoeni = 0;
    double poeni=0;		
    
    for(Kartica k : listaKartica ) {
    if(k.Poeni>100);
       extraPoeni += (k.getPoeni() * 20/100);
    }
    
    return extraPoeni;
	
    }
}
