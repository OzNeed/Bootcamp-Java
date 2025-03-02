import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        var name = scanner.next();
        System.out.println("Informe a sua idade");
        var age = scanner.nextInt();
        System.out.println("Você e emencipado ? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        // if (age >= 18){
        //     System.out.println("Bem vindo");
        //     System.out.printf("%s, você tem %s anos e está apto a dirigir \n", name,age);
        // } else if (age >= 16 && isEmancipated ){
        //     System.err.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir \n", name, age);
        // } else {
        //     System.err.printf("%s, não está apto a dirigir \n", name);
        // }
        // var candrive = age >= 18 || age >= 16 && isEmancipated;
        // var message = "";
        // if (candrive){
        //    message = name + ", você pode dirigir \n";
        // } else {
        //     message = name + ", você não pode dirigir \n";
        // }
        var candrive = age >= 18 || age >= 16 && isEmancipated;
        var message = candrive ? name + ", você pode dirigir \n" : name + ", você não pode dirigir \n";
        System.out.println(message);
        System.err.println("Fim da execução");
    }
}
