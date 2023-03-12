package com.collectionsandException;

import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList {
	static private void addintoarraylist() {

		java.util.ArrayList<String> myArrayList = new java.util.ArrayList<String>();

		myArrayList.add("1");
		myArrayList.add("2");
		myArrayList.add("3");
		myArrayList.add("four");
		myArrayList.add("7");

		// 1)))
		System.out.println(myArrayList.toString());
		System.out.println(
				"**********************************************************************************************************");

		// 2)))) loop using each loop
		for (String box : myArrayList) {
			System.out.println(box);
		}
		System.out.println(
				"******************************************************************************************************************");

//3)) find size of array list

		int size = myArrayList.size();
		System.out.println("Size of my array list ==" + size);

		System.out.println(
				"***********************************************************************************************************");

		// 4) loop throug the array list find opera is there or not , if not print in
		// console opera is not there
		for (String box2 : myArrayList) {

			if (box2.equalsIgnoreCase("opera")) {
				System.out.println(box2);
			} else {
				System.out.println("There is no opera ");
				break;
			}
		}

	}

	static public void sumOfNumbersStoredInMyArrayList() {

		String result = "";
		CopyOnWriteArrayList<String> myArrayList = new CopyOnWriteArrayList<String>();

		myArrayList.add("1");
		myArrayList.add("2");
		myArrayList.add("3");
		myArrayList.add("four");
		myArrayList.add("5");

		for (String box3 : myArrayList) {

			if (box3.equalsIgnoreCase("four")) {
				result += "4";
				myArrayList.set(3, result);

			}
		}
		System.out.println("List of String ="+myArrayList);
		int sum =0;
		 for (String var : myArrayList) {
		int op= Integer.parseInt(var);
		
		sum = sum + op;
		}
	
		 System.out.println("total sum of array list =" +sum);
	}

	public static void main(String[] args) {
//		 addintoarraylist();
		sumOfNumbersStoredInMyArrayList();
	}
}
