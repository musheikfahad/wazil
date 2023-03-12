package com.collectionsandException;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry.*;
import java.util.Set;

public class Demo {
	public static void main(String srgs[]) {

		String m = "hello world";

		String str = m.replace(" ", "");
		char[] ch = str.toCharArray();

		Map<Character, Integer> vowmap = new HashMap<Character, Integer>();

		Map<Character, Integer> conMap = new HashMap<Character, Integer>();

		for (char box : ch) {
			if (box == 'A' || box == 'a' || box == 'E' || box == 'e' || box == 'I' || box == 'i' || box == 'O'
					|| box == 'o' || box == 'U' || box == 'u') {

				if (vowmap.containsKey(box)) {

					Integer value = vowmap.get(box);

					vowmap.put(box, value + 1);
				} else {
					vowmap.put(box, 1);
				}

			} else {
				if (conMap.containsKey(box)) {
					Integer value = conMap.get(box);

					conMap.put(box, value + 1);

				} else {
					conMap.put(box, 1);
				}
			}

		}
		System.out.println(vowmap);
System.out.println(conMap);
	}
}