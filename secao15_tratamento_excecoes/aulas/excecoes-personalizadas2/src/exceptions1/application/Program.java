package exceptions1.application;

import exceptions1.model.Reservation;
import exceptions1.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("check-in date(dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("check-out date(dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("\n" + reservation);

            System.out.println("\n" + "Enter data to update the reservation: ");
            System.out.print("check-in date(dd/MM/yyyy): ");
            Date newCheckin = sdf.parse(sc.next());
            System.out.print("check-out date(dd/MM/yyyy): ");
            Date newCheckout = sdf.parse(sc.next());

            reservation.updateDates(newCheckin, newCheckout);
            System.out.println("\n" + reservation);

            sc.close();
        } catch (ParseException e) {
            System.out.println("invalid date format");
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
