package Exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Idade {
    static void main() {
        var scanner = new Scanner(System.in);
        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("==== IDADE BASEADA NO ANO DE NASCIMENTO ====");
        System.out.println("Digite o seu nome");
        var name = scanner.next();
        System.out.println("Digite o ano de seu nascimento");
        var year = scanner.nextInt();
        if (year > baseYear) {
            System.out.println("Ano Inválido. O ano não pode ser maior do que o que nós estamos");
        } else {
            var idade = baseYear - year;
            System.out.printf("Olá %s, você tem %d anos de idade", name, idade);
        }
    }
}
