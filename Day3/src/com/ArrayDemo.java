package com;

import java.util.Arrays;

public class ArrayDemo {
	public void acceptName(String... name) {
		for(String s: name)
			System.out.println(s);
	}
	public static void main(String[] args) {
		/*
		 * //int arr[]= {10,65,32,23,77,12,7}; int arr1[]= new
		 * int[]{10,65,32,23,77,12,7}; int arr[]=Arrays.copyOfRange(arr1, 0, 6);
		 * 
		 * 
		 * Arrays.sort(arr); System.out.println("================");
		 * System.out.println(Arrays.binarySearch(arr, 66));
		 * System.out.println("====================="); for(int x:arr) {
		 * System.out.println(x); }
		 */
		ArrayDemo obj=new ArrayDemo();
		obj.acceptName("Trisha","Suman");
	}

}
