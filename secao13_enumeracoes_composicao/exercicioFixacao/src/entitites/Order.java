package entitites;

import entitites.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // variavel sdf com formato da data nasc
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // variavel sdf com formato da data pedido
    private Date moment;
    private OrderStatus status;

    // sub-classes
    private Client client;
    private List<OrderItem> orderItem = new ArrayList<>();

    // sobrecarga
    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    // getters and setters
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    // methods
    public void addItem(OrderItem item) {
        orderItem.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItem.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item : orderItem) {
            sum += item.subTotal();
        }
        return  sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY: ");
        sb.append("\nOrder moment: " + sdf1.format(moment));
        sb.append("\nOrder status: " + status);
        sb.append("\nClient: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());

        sb.append("\n\nORDER ITEMS: ");
        for (OrderItem item : orderItem) {
            sb.append("\n" + item.getProduct().getName()
                    + ", $" + String.format("%.2f",item.getProduct().getPrice())
                    + ",  Quantity: " + item.getQuantity()
                    + ", Subtotal: $" + String.format("%.2f",item.subTotal()));
        }

        sb.append("\nTotal price: $" + String.format("%.2f",total()));

        return sb.toString();
    }

}
