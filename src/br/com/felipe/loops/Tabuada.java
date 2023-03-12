package br.com.felipe.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja ver a tabuada de qual número? ");
        int tabuada = scanner.nextInt();
        //int numero = 0;
        int resultado;

        System.out.println("Esta é a tabuada do número " + tabuada + ":");

        for(int numero = 0; numero <= 10; numero++) {
            resultado = tabuada * numero;
            System.out.println(tabuada + " X " + numero + " = " + resultado);
        }
        
        /*
        while(numero <= 10) {
            resultado = tabuada * numero;
            System.out.println(tabuada + " X " + numero + " = " + resultado);
            numero++;
        }
        */
        
        System.out.println("Tabuada completa!");
    }
}
