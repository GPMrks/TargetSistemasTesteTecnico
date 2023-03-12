package org.gpmrks.Teste5;

import java.util.Scanner;

public class Teste5 {

    public static void main(String[] args) {

        String palavra;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        for (int i = palavra.length()-1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }
    }
}
