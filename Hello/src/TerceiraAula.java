import java.util.Scanner;

public class TerceiraAula {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s)", canDrive);

        /*
         = -> atribuição
         == -> comparação
         != - valores diferente
         > -> maior
         >= -> maior ou igual
         < -> menor
         <= -> menor ou igual
         || -> para validar outra váriavel em uma linha de validação
         && -> valida se os dois valores são true, caso um de false, o valor retornado e false.
         */
    }
}
