package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import inventory.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int response;
		List<Product> list = new ArrayList<>();

		System.out.println("Choose an option\n");

		do {
			System.out.println("1. Add a new product");
			System.out.println("2. Remove a product from stock");
			System.out.println("3. Update a product's price");
			System.out.println("4. List all products");
			System.out.println("5. Exit\n");

			response = sc.nextInt();

			switch (response) {
			case 1:
				System.out.println("\n=============== Add a new product ===============\n");

				int id;
				Product existingProduct;
				do {
					System.out.print("ID: ");
					id = sc.nextInt();
					existingProduct = null;

					for (Product p : list) {
						if (p.getId() == id) {
							existingProduct = p;
							break;
						}
					}

					if (existingProduct != null) {
						System.out.println("\nThis ID is already in use! Try again...\n");
					}
				} while (existingProduct != null);

				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Price: R$ ");
				double price = sc.nextDouble();

				list.add(new Product(id, name, price));
				System.out.println("\nProduct added to stock successfully!");

				System.out.println("\n=================================================\n");
				break;

			case 2:
				System.out.println("\n========== Remove a product from stock ==========\n");

				if (list.isEmpty()) {
					System.out.println("The inventory is empty...");
					System.out.println("\n=================================================\n");
					break;
				}

				do {
					System.out.print("ID: ");
					id = sc.nextInt();

					existingProduct = null;
					for (Product p : list) {
						if (p.getId() == id) {
							existingProduct = p;
							break;
						}
					}

					if (existingProduct == null) {
						System.out.println("\nThis ID does not exist. Try again...\n");
					}

				} while (existingProduct == null);

				list.remove(existingProduct);
				System.out.println("\nProduct removed from stock successfully!");

				System.out.println("\n=================================================\n");
				break;

			case 3:
			    System.out.println("\n============ Update a product's price ===========\n");

			    if (list.isEmpty()) {
			        System.out.println("The inventory is empty...");
			        System.out.println("\n=================================================\n");
			        break;
			    }

			    do {
			        System.out.print("ID: ");
			        id = sc.nextInt();

			        existingProduct = null;
			        for (Product p : list) {
			            if (p.getId() == id) {
			                existingProduct = p;
			                break;
			            }
			        }

			        if (existingProduct == null) {
			            System.out.println("\nThis ID does not exist. Try again...\n");
			        } else {
			            System.out.println("\n" + existingProduct);
			        }

			    } while (existingProduct == null);

			    System.out.print("New Price: R$ ");
			    double newPrice = sc.nextDouble();
			    existingProduct.setPrice(newPrice);

			    System.out.println("\nProduct price updated successfully!");

			    System.out.println("\n=================================================\n");
			    break;

				
			case 4:
				System.out.println("\n=============== List all products ===============\n");
				
				if (list.isEmpty()) {
			        System.out.println("The inventory is empty...");
			        System.out.println("\n=================================================\n");
			        break;
			    }
				
				for (Product p : list) {
					System.out.println(p);
				}

				System.out.println("\n=================================================\n");
				break;
				
			case 5:
				System.out.println("\nExiting...");
				break;
				
			default:
				System.out.println("Choose a valid option\n");
				break;
			}

		} while (response != 5);

		sc.close();
	}
}