package edu.gatech;

public class phone {
	
	private String name;
	private int screenSize;
	private int memoryRam;
	private int fiyat;
	
	public phone() {
		//super();
		//this.name = name;
		//this.screenSize = screenSize;
		//this.memoryRam = memoryRam;
	}
	
	public void setFiyat() {
		this.fiyat=1000;		
	}
	public void setFiyat(int fiyat) {
		this.fiyat =fiyat;
	}
	
	public int getFiyat() {
		return this.fiyat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public int getMemoryRam() {
		return memoryRam;
	}
	public void setMemoryRam(int memoryRam) {
		this.memoryRam = memoryRam;
	}
	
	
//	public void playMusic (String trackName) {
//		System.out.println("Calýnan Sarký"+trackName);
//	}
	
	/**
	 * Returns the document of our car. 
	 */

//private void xxx ile sadece bu class ta çaðrýlabilir bir metod.


}
