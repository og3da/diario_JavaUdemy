package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        // dados do produto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        // printando dados produto
        System.out.println();
        System.out.println("product data: " + product.toString());

        // adicionando produtos ao estoque
        System.out.println();
        System.out.print("Enter the number of products to be added to stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);
        System.out.println("updated data: " + product.toString());

        // removendo produtos do estoque
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);
        System.out.println("updated data: " + product.toString());

        sc.close();
    }
}
