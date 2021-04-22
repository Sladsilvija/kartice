package kartice;

import interfejsovi.IPoeni;

public class Kartica extends BasicCard implements IPoeni {

	private double sipanoLitara;
	private int tipkartice1;
	private int tipKartice2;
	public int Poeni;
	
	
	
	
	public double getSipanoLitara() {
		return sipanoLitara;
	}


	public void setSipanoLitara(double sipanoLitara) {
		this.sipanoLitara = sipanoLitara;
	}


	public int getTipkartice1() {
		return tipkartice1;
	}


	public void setTipkartice1(int tipkartice1) {
		this.tipkartice1 = tipkartice1;
	}


	public int getTipKartice2() {
		return tipKartice2;
	}


	public void setTipKartice2(int tipKartice2) {
		this.tipKartice2 = tipKartice2;
	}

	
	
	public Kartica() {
		
	}
	

	public Kartica(double sipanoLitara, int tipkartice1, int tipKartice2) {
		super();
		this.sipanoLitara = sipanoLitara;
		this.tipkartice1 = tipkartice1;
		this.tipKartice2 = tipKartice2;
	}


	@Override
	public void ispisiKarticu(int id, String pan) {
		
	System.out.println("Id kartice:" + id);	
	System.out.println("Pan kartice:" + pan);
	

	}
	
   
    
    @Override
	public  int izracunajBrojPoena () {
     if (this.sipanoLitara>0) {
           this.tipkartice1=2;
     } else {this.sipanoLitara>0;
    	 } this.tipKartice2=3;
    	 

    return izracunajBrojPoena();
    

	}
	
}
