package edu.gatech;

import java.util.Random;
import java.util.Scanner;

public class AddNumbers {


	public static void main(String[] args) {
		//System.out.println("Hello World");
		Random random= new Random();
		int number= random.nextInt(10+1);
		System.out.println(number);
		int a=1; //basarýlý sonuclandý mý?
	
		System.out.println("Ýsminiz???"+"\n");
		Scanner scanner = new Scanner(System.in);
		String isim= scanner.next();
		System.out.println(isim+" lütfen tahmin yapýnýz.Bol sans");

		
		for (int i=0; i<3; i++) {

			int tahmin= scanner.nextInt();
			System.out.println("Tahmininiz: " +tahmin);			
			
			if(number==tahmin) {
				System.out.println("Bugün sanslý gününüzdesiniz...");
		        a=0;
				break;
			}else { 

				if(number<tahmin) {
					System.out.println("tekrar deneyiniz.daha küçük");
				}else {
					System.out.println("tekrar deneyiniz daha büyük");
				}
			}
			}
		if(a==1) {
		System.out.println(isim+"maalesef baska gün tekrar deneyiniz.");
		}
	}
	
}
