package com.evergent.corejava.sahitya.application4;

import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

public abstract class AbstractModule implements ManagementModule {
    protected static int itemcost;
    protected static int amount;
    protected static int countofdresses;
    
    // Constructor
    public AbstractModule(String name) {
        itemcost = 0;
        amount = 0;
        countofdresses = 0;
    }

    @Override
    public void processOption(String option) throws IOException {
        switch (option) {
            case "F":
                displayOptions();
                String floorOption = getInput("Please select a floor module (F1, F2, F3, F4, M): ");
                handleFloorSelection(floorOption);
                break;
            case "P":
                displayOptions();
                String paymentOption = getInput("Please select a payment module (T, S, M): ");
                handlePaymentSelection(paymentOption);
                break;
            case "Q":
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    protected abstract void handleFloorSelection(String option) throws IOException;

    protected abstract void handlePaymentSelection(String option) throws IOException;

    protected String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
