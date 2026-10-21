import java.util.Scanner;

public class AtribuicaoELogicos {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isemancipated = scanner.nextBoolean();
        var canDrive = age > 17 || isemancipated && age >= 16;
        System.out.println("Você pode dirigir? \n" + canDrive);
    }
}
