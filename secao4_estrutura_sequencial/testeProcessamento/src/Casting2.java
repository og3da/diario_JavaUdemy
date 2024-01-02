public class Casting2 {
    public static void main(String[] args) {

        double a;
        int b;

        a = 5.0;
        // b = a; // nesse caso vai ser apontado erro pois nao podemos atribuir uma var double a uma int
        b = (int) a;
        System.out.println(b);
    }
}
