package edu.gatech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> isimler = new ArrayList<>();

	isimler.add("Vahap");
	isimler.add("Defne"); //branch denemesi
	isimler.add("Gokce");  //sprint1
	
	System.out.println(isimler.get(1));
	System.out.println("Suanda " + isimler.size() + " kiþi tanýmlanmýþ");
	
	//isimler.remove(isimler.indexOf("Gokce"));
	
	isimler.sort(null);
	
	System.out.println(isimler.get(1));
	System.out.println("Suanda " + isimler.size() + " kiþi tanýmlanmýþ");
	
	Map<String, String> contacts = new HashMap<>();
	contacts.put("Vahap", "1234");
	contacts.put("Gokce", "4321");
	System.out.println(contacts.get("Vahap"));
	
	System.out.println(contacts.containsKey("Vahap"));
	System.out.println(contacts.containsValue("4321"));
		
	
	
	}

}
