import java.util.Scanner;

public class PrimeiroEXE {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja ");
        var number = scanner.nextInt();
        for (var i = 1;i < 11;i++){
            var result = number * i;
            System.out.printf("%s * %s = %s \n", number, i, result);
        }
    }

}
