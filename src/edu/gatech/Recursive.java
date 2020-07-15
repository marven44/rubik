package edu.gatech;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a;
		int b;
		
		
		while(true) {
		System.out.println("lütfen sayý toplamý için 1 e, fibonacci serisi için 2 ye basýnýz...");
		System.out.println("sonlandýrmak için 3 e basýnýz");
		a = scan.nextInt();
		if(a==1) {
			System.out.println("kaca kadar toplama yapýlsýn?");
			b = scan.nextInt();		
			System.out.println("sayýlarýn toplamý \t"+ f(b));
			a=0;
		}else if(a==2) {
			System.out.println("kac elemanlý bir seri olsun?");
	
			b = scan.nextInt();		
			for(int j=0;j<b;j++){
				System.out.println(rec_fibo(j));
			}
			a=0;
		}else if(a==3) {
			break;
		}
			else System.out.println("Lütfen geçerli tercih yapýnýz...");
			a=0;
		}
		System.out.println("program kapatýlýyor");
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
