package application;

import entitites.Client;
import entitites.Order;
import entitites.OrderItem;
import entitites.Product;
import entitites.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // variavel sdf com formato da data nasc

        // recebendo dados do cliente
        System.out.println("ENTER CLIENT DATA: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);

        // recebendo dados do pedido
        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.next();
        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        System.out.print("How many items to this order?: ");
        int N = sc.nextInt();

        // recebendo dados de cada item do pedido
        for (int i=1; i<=N; i++) {
            sc.nextLine();
            System.out.println("\nEnter #" +i+ " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Product quantity: ");
            Integer productQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }

        // exibindo resultados
        System.out.println(order.toString());
    }
}
