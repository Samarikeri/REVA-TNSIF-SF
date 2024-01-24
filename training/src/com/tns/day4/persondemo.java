package com.tns.day4;

import java.util.Scanner;

public class persondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person obj=new person ();
		String name,gender;
		int income,age,tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter gnder");
		gender=sc.next();
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter incom");
		income=sc.nextInt();
		System.out.println("enter tax");
		tax=sc.nextInt();
		
		obj.setName(name);
		obj.setGender(gender);
		obj.setAge(age);
		obj.setIncome(income);
		obj.setTax(tax);
		
		System.out.println(obj);

	}

}
