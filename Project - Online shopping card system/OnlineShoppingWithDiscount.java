package project;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShoppingWithDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 55000));
        products.add(new Product(2, "TV", 38000));
        products.add(new Product(3, "Smartphone", 20000));
        products.add(new Product(4, "Headphones", 1200));
        products.add(new Product(5, "Mouse", 400));
        int nextProductId = 6;

        while (true) {
            System.out.println("\nWelcome to Online Shopping");
            System.out.println("User Type:");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int userType = scanner.nextInt();

            if (userType == 1) {
                while (true) {
                    System.out.println("\nAdmin Menu");
                    System.out.println("1. Add Product");
                    System.out.println("2. View Products");
                    System.out.println("3. Exit Admin Section");
                    System.out.print("Enter your choice: ");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (adminChoice == 1) {
                        System.out.print("Enter Product Name: ");
                        String productName = scanner.nextLine();
                        System.out.print("Enter Product Price: ");
                        double productPrice = scanner.nextDouble();
                        products.add(new Product(nextProductId++, productName, productPrice));
                        System.out.println("Product added successfully!");

                    } else if (adminChoice == 2) {
                        if (products.isEmpty()) {
                            System.out.println("No products available.");
                        } else {
                            System.out.println("\nAvailable Products:");
                            for (Product product : products) {
                                System.out.println(product);
                            }
                        }
                    } else if (adminChoice == 3) {
                        System.out.println("Exiting Admin Section");
                        break;
                    } else {
                        System.out.println("Invalid choice");
                    }
                }

            } else if (userType == 2) {
                ShoppingCart cart = new ShoppingCart();

                while (true) {
                    System.out.println("\nUser Menu");
                    System.out.println("1. Add Product to Cart");
                    System.out.println("2. Remove Product from Cart");
                    System.out.println("3. View Cart");
                    System.out.println("4. Checkout");
                    System.out.println("5. Exit User Section");
                    System.out.print("Enter your choice: ");
                    int userChoice = scanner.nextInt();

                    switch (userChoice) {
                        case 1:
                            System.out.println("\nAvailable Products:");
                            for (Product product : products) {
                                System.out.println(product);
                            }
                            System.out.print("Enter Product ID to add: ");
                            int productId = scanner.nextInt();
                            System.out.print("Enter quantity: ");
                            int quantity = scanner.nextInt();

                            boolean productFound = false;
                            for (Product product : products) {
                                if (product.getId() == productId) {
                                    cart.addProduct(product, quantity);
                                    System.out.println("Product added to cart!");
                                    productFound = true;
                                    break;
                                }
                            }

                            if (!productFound) {
                                System.out.println("Invalid Product ID!");
                            }
                            break;

                        case 2:
                            System.out.print("Enter Product ID to remove: ");
                            int removeId = scanner.nextInt();
                            cart.removeProduct(removeId);
                            break;

                        case 3:
                            cart.displayCart();
                            break;

                        case 4:
                            cart.displayCart();
                            System.out.println("Total Price (with applicable discounts): " + cart.calculateTotal());
                            System.out.println("Thank you for shopping!");
                            return;

                        case 5:
                            System.out.println("Exiting User Section");
                            return;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }

            } else if (userType == 3) {
                System.out.println("Thank you for visiting");
                break;

            } else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}
