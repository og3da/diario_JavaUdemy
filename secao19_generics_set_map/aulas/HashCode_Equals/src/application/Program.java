package application;

public class Program {
    public static void main(String[] args) {

        String a = "Maria";
        String b = "Alex";

        // printando se a Str "a" é igual a "b"
        System.out.println(a.equals(b));

        // printando hashcode
        System.out.println("\n"+a.hashCode());
        System.out.println(b.hashCode());
    }
}
