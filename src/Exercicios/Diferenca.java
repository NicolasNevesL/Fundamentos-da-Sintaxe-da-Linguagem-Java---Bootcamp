package Exercicios;

import java.util.Scanner;

public class Diferenca {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("==== DIFERENÇA DE IDADE ====\n");
        System.out.println("Digite uma idade");
        var age1 = scanner.nextInt();
        System.out.println("Digite outra idade");
        var age2 = scanner.nextInt();
        var dif = age1 - age2;
        System.out.printf("A diferença de idade de %d e %d é de %d", age1, age2, dif);
    }
}
