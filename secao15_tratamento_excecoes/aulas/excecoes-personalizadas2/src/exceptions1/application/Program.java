package exceptions1.application;

import exceptions1.model.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("check-in date(dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.print("check-out date(dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.next());

        if (!checkout.after(checkin)) {
            System.out.println("Error in reservation: checkout must be after checkin");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("\n" + reservation);

            System.out.println("\n" + "Enter data to update the reservation: ");
            System.out.print("check-in date(dd/MM/yyyy): ");
            Date newCheckin = sdf.parse(sc.next());
            System.out.print("check-out date(dd/MM/yyyy): ");
            Date newCheckout = sdf.parse(sc.next());

            String error = reservation.updateDates(newCheckin, newCheckout);
            if (error != null) {
                System.out.println(error);
            } else {
                System.out.println("\n" + reservation);
            }
        }

    }
}
