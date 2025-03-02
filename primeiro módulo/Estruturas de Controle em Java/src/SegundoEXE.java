import java.util.Scanner;

public class SegundoEXE {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a sua altura:");
        var altura = scanner.nextFloat();
        System.out.println("Digite o seu peso:");
        var peso = scanner.nextFloat();

        var imc = peso / (altura * altura);

        while (true) {

            if (imc <= 18.5) {
                System.out.println("Abaixo do peso");
                break;
            }

            else if (imc >= 18.6 && imc <= 24.9 ){
                System.out.println("peso ideal");
                break;
            }

            else if (imc >= 25 && imc <= 29.9){
                System.out.println("Levemente acima do peso");
                break;
            }

            else if (imc >= 30 && imc <= 34.9){
                System.out.println("Obesidade Grau I");
                break;
            }

            else if (imc >= 35 && imc <= 39.9){
                System.out.println("Obesidade grau II(Severa)");
                break;
            }

            else{
                System.out.println("Obesidade III (Mórbido)");
                break;
            }
        }
    }

}
