import java.util.Scanner;

public class Exerciocio4 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.err.println("Digite a idade:");
        var age1 = scanner.nextInt();
        System.err.println("Digite a idade:");
        var age2 = scanner.nextInt();
        var result = age1 - age2;
        System.err.printf("A diferença de idade é: %s", result);
    }

}
