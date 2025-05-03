import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Deseja imprir a hora [1]Sim [2]Não");
            var opcao =scanner.nextInt();
            if(opcao == 1){
                while (true){
                    System.out.println("Qual horas deseja imprimir ?");
                    System.out.println("Digite as horas: ");
                    var horas = scanner.nextInt();
                    System.out.println("Digite os minutos:");
                    var minutos = scanner.nextInt();
                    System.out.println("Digite os segundos");
                    var segundos = scanner.nextInt();
                    if(horas <=24 && minutos <= 60 && segundos <= 60){
                        americano americano = new americano(horas, minutos, segundos);
                        brasileiro brasileiro = new brasileiro(horas, minutos, segundos);
                        relogio relogio = new relogio(horas, minutos, segundos);
                        System.out.println("No Brasil são: " + brasileiro.horaBrasil());
                        System.out.println("No Estados Unidos são: " + americano.formatHoras());
                        break;
                    }else{
                        System.out.println("Digite um horário correto!");
                        continue;
                    }
                }
            }
            else if(opcao == 2){
                System.out.println("Obrigado por usar");
                break;
            }
            else{
                System.out.println("Digite uma opção válida!");
                continue;
            }
        }
    }
}
