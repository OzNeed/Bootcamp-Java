import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        var name = scanner.next();
        System.out.println("Digite o seu ano de nascimento:");
        var yearBorn = scanner.nextInt();
        var age = baseYear - yearBorn;
        System.out.printf("Olá %s, você tem %s anos!",name, age);
    }    

}
