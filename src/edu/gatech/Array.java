package edu.gatech;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		String[] students= new String[4];
		students[0]="Gül";
		students[1]="Vahap";
		students[2]="Gokce";
		students[3]="Defne";
		
		for(int i=0; i<students.length;i++) {
		System.out.println(students[i]);
		}
		
		int[] numbers = {1,3,5,7,9};
		boolean x=false;
		System.out.println("Lütfen isim giriniz:");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();

		for(int i=0;i<students.length;i++) {
		if(name.equals(students[i])) {
			System.out.println("ögrenci var");
			x=true;
		}
		}
		if(x!=true) System.out.println("bulunamadı");
	}

}
