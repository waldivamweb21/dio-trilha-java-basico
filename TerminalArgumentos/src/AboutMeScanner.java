import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args){
    
        //Criando Objeto Scanner
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
       
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.next();
       
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();
       
        System.out.println("Digite a sua altura: ");
        double altura = teclado.nextDouble();
       
        
        System.out.println("Ola, me chamo: " + nome + " " + sobrenome);
        System.out.println("Tenho: " + idade + " anos ");
        System.out.println("Minha altura é: " + altura + "cm ");
    
    }
}

