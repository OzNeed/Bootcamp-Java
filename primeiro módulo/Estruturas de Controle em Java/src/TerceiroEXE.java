import java.util.Scanner;

public class TerceiroEXE{
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("digite um número: ");
        var first_number = scanner.nextInt();
        System.out.println("Digite um número maior que o anterior: ");
        var second_number = scanner.nextInt();
        System.out.println("Lista de números [1]pares ou [2]impar");
        var choice = scanner.nextInt();

        if (choice == 1){
            for(var i = second_number; i >= first_number; i--){
                if ((i % 2) != 0){
                continue;
                }else if ((i % 2) == 0) {
                    System.out.printf("%s ", i);
                }else{
                    break;
                } 
            }
        }

        if (choice == 2){
            for (var i = second_number; i >= first_number; i--){
                if ((i % 2) != 0){
                    continue;
                }else if ((i % 2) == 0) {
                    System.out.printf("%s ", i);
                }else{
                    break;
                } 
            }
        }
    }
}