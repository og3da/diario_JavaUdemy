package app;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        System.out.print("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();

        // exibir area perimetro e diagonal
        System.out.println();
        System.out.println("AREA= " + rectangle.area());
        System.out.println("PERIMETER= " + rectangle.perimeter());
        System.out.println("DIAGONAL= " + rectangle.diagonal());

        sc.close();
    }
}
