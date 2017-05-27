package com.test.ds.algo;

public class RecursionEx {

	public static void main(String[] args) {
		System.out.println("100 series of fibonnaci nunmber");
		
		System.out.println("Sum of 10 Fibonnci number is " + fib(10));
		
	}

	private static int  fib(int i) {
			if(i==1 || i==2){
				return 1;
				
			}
			else{
				return (fib(i-1) + fib(i-2));
			}
	}

}
