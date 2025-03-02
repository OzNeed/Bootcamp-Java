import java.util.Scanner;

public class TerceiraAula {
    
    public static void main(String[] args) {
        for (var i = 0;i < args.length;i++){
            // System.out.println("Digite um nome:");
            // var name = scanner.next();
            // if (name.equalsIgnoreCase("exit")) break;
            // System.out.println(name);

            if (i == 23){
                System.out.println("Fim da execução");
                break;
            } 

            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        
            System.out.println(args[i]);
        }
    }

}
