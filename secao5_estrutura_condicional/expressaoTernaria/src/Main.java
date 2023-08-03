public class Main {
    public static void main(String[] args) {

        // usando esse codigo de exemplo, temos a condição:
        // se preço < 20 desconto 10% senao 0.05% de desconto
/*
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }
*/

/*      podemos usar expressão ternária que é:
        um if / else em uma unica linha
        Sintaxe:
        ( condição ) ? valor_se_verdadeiro : valor_se_falso
*/
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}