package com.evergent.corejava.sahitya.application4;

import java.io.IOException;
//main class
public class DeMartManagementSystem {
    public static void main(String[] args) throws IOException {
        
        System.out.println("\n\t\t \t\t Welcome To DeMart Management System");
        UserLogin u= new UserLogin();
        String name = u.login();
        DeMartModule module = new DeMartModule(name);
        while (true) {
            System.out.println("======================");
            System.out.println(" De-Mart Management System ");
            
            System.out.println("======================");
            System.out.println("F - Floors");
            System.out.println("P - Payment Module");
            System.out.println("Q - Quit");
            System.out.println("======================");

            String option = module.getInput("Please choose the module (F, P, Q): ");
            module.processOption(option);
        }
    }
}
