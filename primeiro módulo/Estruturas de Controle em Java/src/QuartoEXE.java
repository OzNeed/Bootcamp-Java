import java.util.Scanner;

public class QuartoEXE {
    
public static void main(String[] args) {
    
    var scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    var first_number = scanner.nextInt();
    var keepVerify = true;
    while(keepVerify){
        System.out.println("Digite outro número: ");
        var second_number = scanner.nextInt();
        var result  = second_number % first_number;

        if (first_number > second_number){
            System.out.println("não pode digitar o segundo número, menor que o primeiro!");
            continue;
        }

        keepVerify = result == 0;
        System.out.printf("%s %% %s = %s \n", first_number, second_number, result);

    }
}

}
