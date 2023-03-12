package br.com.felipe.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("De qual número você quer o resultado Fatorial (!)? ");
        int fatorial = scanner.nextInt();
        int resultado = 1;

        for (int i = fatorial; i >= 1; i--) {
            resultado = resultado * i;
            //System.out.println(resultado);9
        }

        System.out.println("O resultado de " + fatorial + "! é: " + resultado);
    }
}
