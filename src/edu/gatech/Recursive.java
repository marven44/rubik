package edu.gatech;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a;
		int b;
		
		
		while(true) {
		System.out.println("l�tfen say� toplam� i�in 1 e, fibonacci serisi i�in 2 ye bas�n�z...");
		System.out.println("sonland�rmak i�in 3 e bas�n�z");
		a = scan.nextInt();
		if(a==1) {
			System.out.println("kaca kadar toplama yap�ls�n?");
			b = scan.nextInt();		
			System.out.println("say�lar�n toplam� \t"+ f(b));
			a=0;
		}else if(a==2) {
			System.out.println("kac elemanl� bir seri olsun?");
	
			b = scan.nextInt();		
			for(int j=0;j<b;j++){
				System.out.println(rec_fibo(j));
			}
			a=0;
		}else if(a==3) {
			break;
		}
			else System.out.println("L�tfen ge�erli tercih yap�n�z...");
			a=0;
		}
		System.out.println("program kapat�l�yor");
	}
 
		
	public static double f(double x) {
		
		if(x==0) {
			return 0 ;
		} else
		//System.out.println("x:"+x);
		return x+f(x-1);
	}
	
	public static int rec_fibo(int x) {
		
		if(x==0) return 1;		
		if(x==1) return 1;
		return rec_fibo(x-1)+rec_fibo(x-2);	
		}
	
		
	
}
