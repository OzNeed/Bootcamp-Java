import java.util.Scanner;

public class QuartaAula {
    
    public static void main(String[] args) {
        var i = 0;
        // var scanner = new Scanner(System.in);
        // var name = "exit";
        // // var name = "";
        // while (!name.equalsIgnoreCase("exit")) {
        //     System.out.println("Informe um nome");
        //     name = scanner.next();
        //     System.out.println(name);
            // if (name.equalsIgnoreCase("exit")) break;
        // }
        // do {
        //     System.out.println("Informe um nome");
        //     name = scanner.next();
        //     System.out.println(name);
        // }while(!name.equalsIgnoreCase("exit"));

            
        while (args.length > i){
            System.out.println(args[i]);
            i++;
        }
        i = 0;
        System.out.println("=============");
        do{
            System.out.println(args[i]);
            i ++;
        }while (args.length > i);
    }

}
