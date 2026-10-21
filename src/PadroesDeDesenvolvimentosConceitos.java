import java.util.Scanner;

public class PadroesDeDesenvolvimentosConceitos {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome");
        var name = scanner.next();
        System.out.println("Olá, informe a sua idade");
        var age = scanner.nextInt();
        System.out.println("Olá " + name + ", sua idade é " + age);
    }
}
