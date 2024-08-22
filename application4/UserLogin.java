package com.evergent.corejava.sahitya.application4;

import java.util.Scanner;
public class UserLogin {
	static String namecheck=new String();
	static String passcheck= new String();
	public String login() {
		// TODO Auto-generated method stub
		int i=0;
		Scanner scanner = new Scanner(System.in);

        
        while(i==0) {
        System.out.println("Please login or signup for the services");
        System.out.println("For Login  Enter 1");
        System.out.println("For Signup Enter 2");
        int user = scanner.nextInt();
        String name;
    	String pass1;
    	String pass2;
        switch(user) {
        case 2:
        	
        	System.out.println("Enter username");
        	name=scanner.next();
        	System.out.println("Enter Password");
        	pass1=scanner.next();
        	System.out.println("Enter Password again");
        	pass2=scanner.next();
        	if(pass1.equals(pass2)) {
            	namecheck=name;
            	passcheck=pass1;
        	}
        	break;
        case 1:
        	System.out.println("Enter username");
        	name=scanner.next();
        	System.out.println("Enter Password");
        	pass1=scanner.next();
        	if(passcheck.equals(pass1) && namecheck.equals(name)) {
        		i=1;
        		System.out.println("loged in");
        		
        	}
            break;
        }
        }
       return namecheck;
	}
}