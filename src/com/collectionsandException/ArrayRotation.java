package com.collectionsandException;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int j = 0; j < 5; j++) {
			int first = a[0];
			for (int i = 0; i < a.length-1; i++) {
				
				a[i] = a[i+1];
				
			}
			a[a.length-1] = first;
				
				
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
