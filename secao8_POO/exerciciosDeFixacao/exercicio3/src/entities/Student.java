package entities;

public class Student {
    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public String finalNote() {
        double notaFinal = n1 + n2 + n3;
        double missing = 60 - notaFinal;
        String aprovado = (notaFinal >= 60) ? "\nPASS" : "\nFAILED \nMISSING POINTS: " + String.format("%.2f", missing);
        return "FINAL GRADE = " + String.format("%.2f", notaFinal) + aprovado;
    }
}
