package edu.gatech;

import java.util.Random;
import java.util.Scanner;

public class AddNumbers {


	public static void main(String[] args) {
		//System.out.println("Hello World");
		Random random= new Random();
		int number= random.nextInt(10+1);
		System.out.println(number);
		int a=1; //basar�l� sonucland� m�?
	
		System.out.println("�sminiz???"+"\n");
		Scanner scanner = new Scanner(System.in);
		String isim= scanner.next();
		System.out.println(isim+" l�tfen tahmin yap�n�z.Bol sans");

		
		for (int i=0; i<3; i++) {

			int tahmin= scanner.nextInt();
			System.out.println("Tahmininiz: " +tahmin);			
			
			if(number==tahmin) {
				System.out.println("Bug�n sansl� g�n�n�zdesiniz...");
		        a=0;
				break;
			}else { 

				if(number<tahmin) {
					System.out.println("tekrar deneyiniz.daha k���k");
				}else {
					System.out.println("tekrar deneyiniz daha b�y�k");
				}
			}
			}
		if(a==1) {
		System.out.println(isim+"maalesef baska g�n tekrar deneyiniz.");
		}
	}
	
}
