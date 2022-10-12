public class OperadoresRelacionais5 {
    public static void main(String[] args) {
        String nome1 = "GLEYSON";
        String nome2 = "GLEYSON";

        System.out.println(nome1 == nome2);
        // se usar comparacao de string usa-se o método: equals.

        //Exemplo:

        String nomeUm = "GLEYSON";
        String nomeDois = new String ("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2) {
            System.out.println("A nossa condicao é verdadeira");
        }
        boolean simNao = numero1 == numero2;

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior que numeroDois? " + simNao);
    }
}
