package br.com.felipe.loops;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        //@SuppressWarnings("resource") -> ignora um warning específico, neste caso o do scanner abaixo.
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int idade;


        while (true) {
            System.out.println("Digite um nome: ");
            nome = scanner.next();
            if (nome.equals("0")) {
                break;
            }
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();
            
        }
        System.out.println("Você finalizou o programa.");
    }
}
