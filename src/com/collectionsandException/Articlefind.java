package com.collectionsandException;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Articlefind {
	static String s = "This is the story about the boy in the the the THe THE tHe london";

	static String[] splitted = s.split(" ");

	private static void mapMethod() {

		Map<String, Integer> theMap = new HashMap<String, Integer>();

		for (String box : splitted) {
			if (theMap.containsKey(box)) {
				Integer value = theMap.get(box);
				theMap.put(box, value + 1);
			} else {
				theMap.put(box, 1);
			}
		}
		System.out.println(theMap);

		System.out.println(
				"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++===============================");

		System.out.println("Duplicate Values");
		Set<Entry<String, Integer>> register = theMap.entrySet();

		for (Entry<String, Integer> entrinnnng : register) {

			if (entrinnnng.getValue() > 1) {

				String key = entrinnnng.getKey();

				Integer value = entrinnnng.getValue();

				System.out.println(key + " = " + value);
			}

		}

	}
	
	private  static void easyWay() {
		boolean flag = true;
		int count =0;
		for(String emptybox  :splitted) {
			if(emptybox.equalsIgnoreCase("the")) {
				
				count++;
				flag=false;
			}
		}
		
		System.out.println("total numbers of the present =="+count);
		
	}

	public static void main(String[] args) {
		easyWay();
		mapMethod();
	}
}
