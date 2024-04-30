package lab4;

import java.util.*;

public class warmup {
	

	public static void main(String[] args) {
		
		Scanner bonjo = new Scanner(System.in);

		 int option = 0;
	        int option2 = 0;
	        int option3 = 0; 
	        double totalPrice = 0.0;

	        List<String> cart = new ArrayList<>(); 

	        while (true) { 
	            System.out.println("1. Buy");
	            System.out.println("2. Check Cart");
	            System.out.println("3. Exit");
	            System.out.print("Enter Choice: ");
	            option = bonjo.nextInt();

	            if (option == 1) {
	                while (true) {
	                    System.out.println("AVAILABLE PRODUCTS");
	                    System.out.println("1. Monitor - 7000.00PHP");
	                    System.out.println("2. Mouse - 800.00PHP");
	                    System.out.println("3. Keyboard - 1000.00PHP");
	                    System.out.println("4. Back");

	                    System.out.print("Enter product number: ");
	                    option2 = bonjo.nextInt();

	                    if (option2 >= 1 && option2 <= 3) {
	                        String itemName = "";
	                        double itemPrice = 0.0;
	                        if (option2 == 1) {
	                            itemName = "Monitor";
	                            itemPrice = 7000;
	                        } else if (option2 == 2) {
	                            itemName = "Mouse";
	                            itemPrice = 800;
	                        } else if (option2 == 3) {
	                            itemName = "Keyboard";
	                            itemPrice = 1000;
	                        }
	                        cart.add(itemName);
	                        totalPrice += itemPrice;
	                        System.out.println(itemName + " has been added to the cart.");
	                    } else if (option2 == 4) {
	                        break;
	                    } else {
	                        System.out.println("Invalid!");
	                    }
	                }
	            } else if (option == 2) {
	                while (true) {
	                    System.out.println("Cart Items:");
	                    int totalItem = 0;
	                    for (String item : cart) {
	                        System.out.println(item);
	                        totalItem++;
	                    }
	                    System.out.println("Total Items: " + totalItem);
	                    System.out.println("Total Price: " + totalPrice + " PHP");
	                    System.out.println("1. Back");
	                    System.out.println("2. Proceed to Payment");
	                    System.out.print("Enter Choice: ");
	                   
	                    if (bonjo.hasNextInt()) {
	                        option3 = bonjo.nextInt();
	                    } else {
	                        System.out.println("Invalid input!");
	                        bonjo.next(); 
	                        continue;
	                    }
	                    if (option3 == 1) {
	                        break;
	                    } else if (option3 == 2) {
	                        
	                        System.out.println("Proceeding to payment...");
	                        
	                        cart.clear();
	                        totalPrice = 0.0;
	                        System.out.println("Payment completed.");
	                        System.exit(0);
	                        break;
	                    } else {
	                        System.out.println("Invalid!");
	                    }
	                }
	            } else if (option == 3) {
	                System.out.println("Exit");
	                System.out.println("Thank you for purchasing!");
	                break; 
	            } else {
	                System.out.println("Invalid!");
	            }
	        }
	    }
	}