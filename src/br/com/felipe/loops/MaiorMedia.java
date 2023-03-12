package br.com.felipe.loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int total = 0;
        double media = 0;
        int i = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (maior < numero) maior = numero;            
            total = total + numero;
            i++;
        } while (i < 5);

        media = total/i;

        System.out.println("O maior número é: " + maior);
        System.out.println("A média de todos os números é: " + media);

    }
}
