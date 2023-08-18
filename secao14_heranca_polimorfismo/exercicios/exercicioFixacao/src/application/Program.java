package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");

        // entrada qtd produtos
        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();
        // loop entrada dados produto
        for (int i=1; i<=N; i++) {
            System.out.println("\nProduct #" +i+ " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            // instanciando objeto conforme tipo do produto
            if (type == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, fee));
            }
            else if (type == 'c') {
                productList.add(new Product(name, price));
            }
            else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sfd.parse(sc.next());
                productList.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        // exibindo produtos
        System.out.println("\nPRICE TAGS:");
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
