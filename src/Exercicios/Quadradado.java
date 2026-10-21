package Exercicios;

import java.util.Scanner;

public class Quadradado {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ÁREA DO QUADRADO ===\n");
        System.out.println("Digite o tamanho do lado do quadrado");
        var lado = scanner.nextDouble();
        var area = Math.pow(lado, 2);
        System.out.printf("A área do quadrado é de %f", area);
    }
}
