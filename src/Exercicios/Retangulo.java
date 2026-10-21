package Exercicios;

import java.util.Scanner;

public class Retangulo {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("==== ÁREA DO RETÂNGULO ====\n");
        System.out.println("Digite o tamanho da base do Retângulo");
        var base = scanner.nextDouble();
        System.out.println("Digite o tamanho da altura do Retângulo");
        var altura = scanner.nextDouble();
        var area = base * altura;
        System.out.printf("A Área do Retângulo é de %f", area);
    }
}
