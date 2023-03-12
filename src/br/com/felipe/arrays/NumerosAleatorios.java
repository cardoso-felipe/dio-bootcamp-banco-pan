package br.com.felipe.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int i : numerosAleatorios) {
            System.out.print(i + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int i : numerosAleatorios) {
            System.out.print((i+1) + " ");
        }
        
        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for (int i : numerosAleatorios) {
            System.out.print((i-1) + " ");
        }
    }
}
