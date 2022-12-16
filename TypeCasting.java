package com.generalPractice;

public class TypeCasting {

	public static void main(String[] args) {
		// Type casting
		byte a  =15;
		byte b = 100;
	   //	byte c = a +b // not possible compile error
		int c = a +b; // higher data type selected
		
		byte d = (byte)( a+b); // type cast
		
	   System.out.println(c);
	   System.out.println("===============================");
	   System.out.println(d);
	   System.out.println("=================================");
	   int f = 10;
	   int g =210;
	   short h = (short) (f +g);
	   System.out.println("h is =" + h);
	   System.out.println("==========================");
	   
	   int r = 20;
	   int e = 30;
	   byte w = (byte) (r +e);
	   System.out.println("w is = " + w);
	   
	   int q = 40;
	   int v = 40;
	   byte m = (byte) (short)(q + v);
	   System.out.println(m); 
	}
}
