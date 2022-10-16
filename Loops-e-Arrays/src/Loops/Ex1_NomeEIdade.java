package Loops;
/*  Obs: Quando tiver LEIA: é pra receber dados do teclado.

Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;
        
        while(true){
            System.out.println("Digite o seu nome: ");
            nome = teclado.next();
            
            if(nome.equals("0"))          //Boas Práticas de Programação: como usa-se só um IF, não precisa de CHAVES {}.
                break;
            
            System.out.println("Digite a sua idade: ");
            idade = teclado.nextInt();
        }

        System.out.println("Continua aqui... ");    
        
        
        
        teclado.close();
    }
}
