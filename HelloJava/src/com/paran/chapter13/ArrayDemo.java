package com.paran.chapter13;
public class ArrayDemo {
	
	
public static void  Array(int[] ar ){
		for(int i = 0;  i < ar.length; i++){
			ar[i] =  i + 1;
			System.out.println(ar[i]);
		}	
	}
public static void  Array2(int[] ar ){
	for(int i = 0;  i < ar.length; i++){
		ar[i] = 10 - i ;
		System.out.println(ar[i]);
	}	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] js  = new int[10];
		Array(js);
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		Array2(js);
}
}