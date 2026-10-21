import java.util.Scanner;

public class Aritmeticos {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Operadores Aritméticos Simples ====");
        System.out.println("SOMA DOIS NUMEROS");
        System.out.println("Digite um numero");
        var num1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        var num2 = scanner.nextInt();
        System.out.printf("A soma de %s + %s é de %s \n", num1, num2, num1 + num2);

        System.out.println("==== Operadores Aritméticos com Math ====");
        System.out.println("POTÊNCIA");
        System.out.println("Digite um numero");
        var num3 = scanner.nextInt();
        System.out.printf("A potência do numero %s elevado a 2 é de %s", num3, Math.pow(num3, 2));

        System.out.println();
        System.out.println("RAÍZ QUADRADA");
        System.out.println("Digite um numero:");
        var num4 = scanner.nextInt();
        System.out.printf("A Raíz quadrada de %s é de %f", num4, Math.sqrt(num4));
    }
}
