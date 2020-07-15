package edu.gatech;

import java.util.Scanner;

public class HelloWorld {


	public static void main(String[] args) {
		String mesaj="Hello World";
		mesaj=mesaj.toUpperCase();
		System.out.println(mesaj);

	//	int a[] = new int[10]; // otomatik olarak sýfýr atar.
	//	int b[] = {1,2,3,4,5};
		
		
	phone iphone = new phone();
	
	iphone.setName("pixelnew");
	
	
	 //System.out.println(iphone.getName());
	 //iphone.setFiyat(2500);
	 //phone.setName(ogretmen.ad);
	// System.out.println(iphone.getFiyat());
	 

	
	//fibonacci serisi örneði
	 System.out.println("lütfen fibonacci boyutu giriniz");
	 Scanner scanner= new Scanner(System.in);
	 int diziboyutu= scanner.nextInt();
	 
		if (diziboyutu>1) {
			
		int a[]=new int[diziboyutu];
		a[0] = a[1] = 1;
			
		for (int i=2;i<diziboyutu;i++) {
			a[i]=a[i-2]+a[i-1];			
		}
		for (int i=0;i<=diziboyutu-1;i++) {
			System.out.println(a[i]+"\t");			
		}		
		
		} else 
			System.out.println("lütfen 2 den büyük pozitif bir sayý giriniz");
	 
	

	 
	 
	}

}
