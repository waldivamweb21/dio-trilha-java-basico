public class OperadoresLogicos5 {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;
        
        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Umas das condições é verdadeira");

        }
            if(condicao1 && ( 7 > 2 )) {
                System.out.println("As duas condições são verdadeiras");
            }
    
            if(condicao1 || condicao2) {
                System.out.println("Umas das condições é verdadeira");
        }

        System.out.println("fim");
    }
}