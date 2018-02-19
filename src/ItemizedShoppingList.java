package main;
import java.util.ArrayList;

import products.Product;

public class ItemizedShoppingList {
	//use in main to send as argument-ArrayList<Product> usersCart = new ArrayList<>();

	// Returns an ArrayList with product added
	public static ArrayList<Product> addToCart(Product product, ArrayList<Product> cart){
		cart.add(product);
		System.out.println(product.getName() + " has been added to your cart");
		return cart;
	}

	// returns an ArrayList with product removed
	public static ArrayList<Product> removeFromCart(Product product, ArrayList<Product> cart){
		cart.remove(product);
		System.out.println(product.getName() + " has been removed from your shopping cart");
		return cart;
	}
	
	// unused but clears cart
	public static ArrayList<Product> emptyCart(ArrayList<Product> cart) {
		cart.clear();
		System.out.println("Your shopping cart has been emptied");
		return cart;
	}

	// returns the sum of the cost in the cart
	public static int sumCart(ArrayList<Product> cart) {
		int sum = 0;
		for(int i = 0;i<cart.size();i++) {
			sum += (cart.get(i).getPrice()) * (cart.get(i).getQuantity());
		}
		return sum; 
	}
	
	// calculates tax of cart
	public static double taxCart(ArrayList<Product> cart) {
		double tax = 0;
		tax = sumCart(cart) * ((double) 0.06);
		return tax;
	}

	// prints subtotal, tax, and grand total
	public static void viewShoppingCart(ArrayList<Product> cart) {
		System.out.printf("\n%-15s $%-10.2f\n", "Subtotal:", sumCart(cart) / ((double) 100));
		System.out.printf("%-15s $%-10.2f\n", "Tax:", taxCart(cart) / 100);
		System.out.printf("%-15s $%-10.2f\n", "Grand Total:", (sumCart(cart) / ((double) 100)) + (taxCart(cart) / 100));
	}

}


