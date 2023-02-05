package com.bit;

public class B {
	public static void main(String[] args) {
		A a=new A();
		int y=a.performAnyAction();//
		int z=y*7;
		int j=z/2;	
		a.conCateValue();
		String x=a.mi("hi");
		String b=x.concat(" HELLO");
		System.out.println(b);
	}

}
