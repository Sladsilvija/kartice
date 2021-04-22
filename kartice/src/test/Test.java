package test;

import kartice.Kartica;

public class Test {

	public static void main(String[] args) {
	
	Kartica Kartica1 = new Kartica();
	
	Kartica1.setId(1);
	Kartica1.setPan("1111");
	Kartica1.setTipkartice1(1);
	Kartica.IspisiKarticu( Kartica1.getId(), Kartica1.getPan(), Kartica1.getTipkartice1());
	}

}
