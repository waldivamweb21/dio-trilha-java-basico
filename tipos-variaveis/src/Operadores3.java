public class Operadores3 {
    public static void main(String[] args) {
        int numero = 5;
        boolean variavel = true;
        numero  = - numero;

        System.out.println(numero);

        numero  = numero * -1; // Torna o numero positivo com a multiplicacao.

        System.out.println(numero);


        // x repeticao

        numero = numero + 1;
        System.out.println(numero);
                                    //outra forma
        
        System.out.println(++ numero); 
        
        System.out.println(numero); 
        
        System.out.println (numero --); 
        
        System.out.println(numero); 

        System.out.println (!variavel); 
        
        System.out.println(variavel); 

        variavel = !variavel;
        System.out.println(variavel);


    }
}