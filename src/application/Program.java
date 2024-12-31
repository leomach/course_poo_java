package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();	

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");			
		}
		
		// ------------------------------------------------
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be remove from stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		// ------------------------------------------
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextInt();
			name = sc.nextLine();
			price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		System.out.printf("Average price = %.2f%n", avg);
		
		// ------------------------------------------
		
		String[] vector = new String[] {"Maria", "Bob", "Alex"};
		for (String obj : vector) {
			System.out.println(obj);
		}
		
		// -----------------------------------------
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Alex");
		list.add("Anna");
		list.add(2, "Marco");
		
		list.size();
		
		list.remove(2);
		list.remove("Bob");
		list.removeIf(i -> i.charAt(0) == 'M');
		
		list.indexOf("Anna");
		
		List<String> result = list.stream().filter(i -> i.charAt(0) == 'A').collect(Collectors.toList());
		for (String i : result) {
			System.out.println(i);
		}
		
		for (String i : list) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
