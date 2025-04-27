import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            Ingresso ingresso = new Ingresso();
            
            System.out.println("=======================");
            System.out.println("Esolha o filme abaixo:");
            System.out.println("1 - Velozes e furiosos");
            System.out.println("2 - Jogos Vorazes");
            System.out.println("3 - Jogador Nº1");
            System.out.println("4 - Invocação do mal");
            System.out.println("=======================");

            var escolha_filme = scanner.nextInt();
                if (escolha_filme >= 1 || escolha_filme <= 4){
                    ingresso.filme(escolha_filme);
                }else{
                    System.out.println("Escolha incorreta, por favor retorne ao inicio");
                    continue;
                }
            
            System.out.println("=======================");
            System.out.println("Qual tipo de áudio deseja assistir o filma:");
            System.out.println("1 - Dublado");
            System.out.println("2 - Legendado");
            System.out.println("=======================");

            var escolha_audio = scanner.nextInt();
                if(escolha_audio == 1 || escolha_audio == 2){
                    ingresso.audio(escolha_audio);
                }else{
                    System.out.println("Escolha incorreta, por favor retorne ao inicio");
                    continue;
                }
            
            System.out.println("=======================");
            System.out.println("Qual o tipo do ingresso:");
            System.out.println("1 - Inteira");
            System.out.println("2 - Estudante");
            System.out.println("3 - Familia");
            System.out.println("=======================");
            var escolha = scanner.nextInt();
            if(escolha == 1){
                System.out.println("============Ticket===========");
                System.out.println("Valor do ingresso:" + ingresso.getValor());
                System.out.println("Filme: " + ingresso.getNome_do_filme());
                System.out.println("Áudio: " + ingresso.getAudio());
                System.out.println("=======================");
                break;
            }
            else if(escolha == 2){
                meia_entrada meiaentrada = new meia_entrada();
                meiaentrada.setValor((float) ingresso.getValor());
                System.out.println("============Ticket===========");
                System.out.println("Valor do ingresso:" + meiaentrada.getReal_valor());
                System.out.println("Filme: " + ingresso.getNome_do_filme());
                System.out.println("Áudio: " + ingresso.getAudio());
                System.out.println("=======================");
                break;
            }
            else if(escolha == 3){
                ingresso_familia ingressofamilia = new ingresso_familia();
                ingressofamilia.setValor((float) ingresso.getValor());
                System.out.println("Informe a quantidade de pessoas:");
                var QTD = scanner.nextInt();
                ingressofamilia.quantidade(QTD);

                System.out.println("============Ticket===========");
                System.out.println("Valor do ingresso:" + ingressofamilia.getValor_familia());
                System.out.println("Filme: " + ingresso.getNome_do_filme());
                System.out.println("Áudio: " + ingresso.getAudio());
                System.out.println("=======================");
                break;
            }
            
        }
    } 
}