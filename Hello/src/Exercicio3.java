import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.err.println("Digite o valor da base do retângulo:");
        var base = scanner.nextFloat();
        System.err.println("Digite o valor da altura do retângulo:");
        var height = scanner.nextFloat();
        var result = base * height;
        System.err.printf("Calculo da área: %s * %s = %s", base, height, result);
    }
}
