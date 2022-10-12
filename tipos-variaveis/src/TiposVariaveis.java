public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos;
        // estudar a classe String que representa texto na aplicação;
        
        String meuNome = "WALDIVAM ALVES";

        double salarioMinimo = 25000;

        short numerocurto = 1;
        int numeroNormal = numerocurto;
        short numerocurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        // final: não permite mudar o valor da variavel, tornando-a uma constante.
        final double VALOR_DE_PI = 3.14;
    }
}
