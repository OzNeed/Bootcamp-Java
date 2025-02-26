import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado, para calcular:");
        var size = scanner.nextInt();
        var area = size * size;
        System.err.printf("Calculo da área: %s * %s = %s", size, size, area);
    }

}
