package Loops;

import java.util.Scanner;

//DO WHILE

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class EX3_MaiorEMedia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
       int numero;
       int maior = 0;
       int soma = 0;

       int count = 0;
       do{
            System.out.println("O numero é: ");  // contar 5x, indepedente do valor atribuido.
            numero = scan.nextInt();

            soma = soma + numero;
                      
            if (numero > maior) maior = numero;

            count = count + 1;
       }while(count < 5);

       System.out.println("Maior é: " + maior);
       System.out.println("Media: " + (soma/5));
    }
}