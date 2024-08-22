package com.evergent.corejava.sahitya.application4;

import java.io.IOException;

public  class DeMartModule extends AbstractModule {
	String name;
    public DeMartModule(String name) {
		super(name);
		this.name=name;
	}

	@Override
    protected void handleFloorSelection(String option) throws IOException {
        switch (option) {
            case "F1":
                handleFloor1();
                break;
            case "F2":
                handleFloor2();
                break;
            case "F3":
                handleFloor3();
                break;
            case "F4":
                handleFloor4();
                break;
            case "M":
                return; // Go back to main menu
            default:
                System.out.println("Invalid floor selection.");
        }
    }

    private void handleFloor1() {
        System.out.println("Floor for kidswear:");
        System.out.println("A - Frocks, Jeans, T-shirts (MRP 257.00)");
        System.out.println("B - Shoes, Caps, Toys (MRP 174.00)");
        String subsection = getInput("Enter your subsection code (A, B): ");
        switch (subsection) {
            case "A":
                itemcost = 257;
                break;
            case "B":
                itemcost = 174;
                break;
            default:
                System.out.println("Invalid subsection.");
                return;
        }
        countofdresses = Integer.parseInt(getInput("Enter the number of dresses: "));
        amount = itemcost * countofdresses;
        System.out.println("Total amount for selected dresses: Rs " + amount);
    }

    private void handleFloor2() {
        System.out.println("Floor for Girlsware & Boysware:");
        System.out.println("A - Tops, Jeans, T-shirts, Leggings, Formals, Partywares, Dressmaterials, Lehengas (MRP 599.00)");
        System.out.println("B - Scarfs, Cosmetics, Watches, Footwear, Belts, Caps, Accessories, Readymade Blouses (MRP 215.00)");
        String subsection = getInput("Enter your subsection code (A, B): ");
        switch (subsection) {
            case "A":
                itemcost = 599;
                break;
            case "B":
                itemcost = 215;
                break;
            default:
                System.out.println("Invalid subsection.");
                return;
        }
        countofdresses = Integer.parseInt(getInput("Enter the number of dresses: "));
        amount = itemcost * countofdresses;
        System.out.println("Total amount for selected dresses: Rs " + amount);
    }

    private void handleFloor3() {
        System.out.println("Floor for Womenware:");
        System.out.println("A - Kanchepattu Sarees, Kadwal Sarees, Kalamkari Sarees, Partyware Sarees (MRP 799.00)");
        System.out.println("B - Casuals Sarees, Cotton Sarees, Banaras Sarees (MRP 499.00)");
        String subsection = getInput("Enter your subsection code (A, B): ");
        switch (subsection) {
            case "A":
                itemcost = 799;
                break;
            case "B":
                itemcost = 499;
                break;
            default:
                System.out.println("Invalid subsection.");
                return;
        }
        countofdresses = Integer.parseInt(getInput("Enter the number of dresses: "));
        amount = itemcost * countofdresses;
        System.out.println("Total amount for selected dresses: Rs " + amount);
    }

    private void handleFloor4() {
        System.out.println("Floor for Gentsware:");
        System.out.println("A - Casuals, T-shirts, Cotton Materials (MRP 399.00)");
        System.out.println("B - Formals, Footwear, Boxers (MRP 699.00)");
        String subsection = getInput("Enter your subsection code (A, B): ");
        switch (subsection) {
            case "A":
                itemcost = 399;
                break;
            case "B":
                itemcost = 699;
                break;
            default:
                System.out.println("Invalid subsection.");
                return;
        }
        countofdresses = Integer.parseInt(getInput("Enter the number of dresses: "));
        amount = itemcost * countofdresses;
        System.out.println("Total amount for selected dresses: Rs " + amount);
    }

    @Override
    protected void handlePaymentSelection(String option) throws IOException {
        switch (option) {
            case "T":
            	System.out.println("Hello "+name+" Here is");
                System.out.println("Total Amount to be Paid: Rs " + amount);
                break;
            case "S":
                System.out.println("-------Summary Of Order---------");
                System.out.println("Number of dresses: " + countofdresses + ", Total amount: Rs " + amount);
                break;
            case "M":
                return; // Go back to main menu
            default:
                System.out.println("Invalid payment selection.");
        }
    }

	@Override
	public void displayOptions() {
		// TODO Auto-generated method stub
		
	}
}
