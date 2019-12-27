package com.ramya.bean;

public class Test {
public static void main(String args[]) {
	Customer c=new Customer("ram","ram@gmail.com",783123122);
	System.out.println(c.getEmail());
	System.out.println(c.getMobile());
	System.out.println(c.getName());
}
}
