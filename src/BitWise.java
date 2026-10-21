public class BitWise {
    static void main() {
        var valure1 = 4;
        var binary1 = Integer.toBinaryString(valure1);
        System.out.println("==== Utilizando Or ( | ) ====");
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valure1, binary1);
        var valure2 = 5;
        var binary2 = Integer.toBinaryString(valure2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valure2, binary2);
        var result = valure1 | valure2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (Representação binária %s)\n", valure1, valure2, result, binaryResult);

        System.out.println();

        var valure3 = 6;
        var binary3 = Integer.toBinaryString(valure3);
        System.out.println("==== Utilizando AND ( & ) ====");
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valure3, binary3);
        var valure4 = 2;
        var binary4 = Integer.toBinaryString(valure4);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valure4, binary4);
        var result2 = valure3 & valure4;
        var binaryResult2 = Integer.toBinaryString(result2);
        System.out.printf(" %s & %s = %s (Representação binária %s)\n", valure3, valure4, result2, binaryResult2);

        System.out.println();

        var valure5 = 7;
        var binary5 = Integer.toBinaryString(valure5);
        System.out.println("==== Utilizando XOR ( ^ ) ====");
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valure5, binary5);
        var valure6 = 3;
        var binary6 = Integer.toBinaryString(valure6);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valure6, binary6);
        var result3 = valure5 ^ valure6;
        var binaryResult3 = Integer.toBinaryString(result3);
        System.out.printf(" %s ^ %s = %s (Representação binária %s)\n", valure5, valure6, result3, binaryResult3);

        System.out.println();

        var valure7 = 7;
        var binary7 = Integer.toBinaryString(valure7);
        System.out.println("==== Left Shift ( << ) ====");
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valure7, binary7);
        var valure8 = 3;
        System.out.printf("Segundo número da operação %s\n", valure8);
        var result4 = valure7 << valure8;
        var binaryResult4 = Integer.toBinaryString(result4);
        System.out.printf(" %s << %s = %s (Representação binária %s)\n", valure7, valure8, result4, binaryResult4);

        System.out.println();

        var valure9 = 7;
        var binary9 = Integer.toBinaryString(valure9);
        System.out.println("==== Right Shift ( >> ) ====");
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valure9, binary9);
        var valure10 = 2;
        System.out.printf("Segundo número da operação %s\n", valure10);
        var result5 = valure9 >> valure10;
        var binaryResult5 = Integer.toBinaryString(result5);
        System.out.printf(" %s >> %s = %s (Representação binária %s)\n", valure9, valure10, result5, binaryResult5);

        System.out.println();

        var valure11 = 9;
        var binary11 = Integer.toBinaryString(valure11);
        System.out.println("==== Right Shift ( >>> ) ====");
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valure11, binary11);
        var valure12 = 3;
        System.out.printf("Segundo número da operação %s\n", valure12);
        var result6 = valure11 >>> valure12;
        var binaryResult6 = Integer.toBinaryString(result6);
        System.out.printf(" %s >> %s = %s (Representação binária %s)\n", valure11, valure12, result6, binaryResult6);
    }
}
