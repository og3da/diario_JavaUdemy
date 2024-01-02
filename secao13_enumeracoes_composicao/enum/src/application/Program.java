package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        // criando novo pedido teste
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        // instanciando enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        // criando novo enum (conversao string para enum)
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
