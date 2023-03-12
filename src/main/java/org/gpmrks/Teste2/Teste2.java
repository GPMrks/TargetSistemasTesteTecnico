package org.gpmrks.Teste2;

import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));

            if (fibonacci(i) == num) {
                System.out.println("\nSequencia Fibonacci contém o número informado: " + num + ". O número é o " + i + " número da sequência.");
                break;
            } else if (fibonacci(i) > num) {
                System.out.println("\nSequencia Fibonacci não contém o número informado: " + num + ".");
                break;
            }
        }

    }

    public static long fibonacci(int num) {
        int atual = 0;
        int anterior = 0;

        for (int i = 1; i <= num; i++) {

            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }

        }

        return atual;
    }
}
