package com.revature.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] kiwis) {
		
		/*MAPS
		 * is an object that maps keys to values (also known as dictionary)
		 * each key has to be unique and can be mapped to only 
		 * value, note that a key can be mapped to duplicate values
		 */
		Map<String,String> myMap = new HashMap<>();
		
		myMap.put("Apple", "A red or green fruit");
		myMap.put("Earth","A blue thing");
		
		myMap.get("Apple");
		System.out.println(myMap.get("Apple"));
		System.out.println(myMap);
		
	}
}
