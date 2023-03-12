package com.collectionsandException;

public class multiply {

	
	static	public int solution(int D, String S) {

		if (S.equalsIgnoreCase("one")) {
			String j = S.replace("one", "1");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		}
		else	if (S.equalsIgnoreCase("two")) {
			String j = S.replace("two", "2");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		}
		else	if (S.equalsIgnoreCase("three")) {
			String j = S.replace("three", "3");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		}
		else	if (S.equalsIgnoreCase("four")) {
			String j = S.replace("four", "4");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		}
		else	if (S.equalsIgnoreCase("five")) {
			String j = S.replace("five", "5");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		}
		else if(S.equalsIgnoreCase("SIX")) {
			String j = S.replace("six", "6");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;
		}
		return D;

	}
	public static void main(String[] args) {
		
		System.out.println(solution(4, "six"));
		
	}
}
