package Segundo_Exercicio;

import java.util.Scanner;

public class carro {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Deseja iniciar o programa [1] Sim [2] Não?");
        var opcao_inicial = scanner.nextInt();
        if (opcao_inicial == 1){
            var criador_carro = true;
            var criador_motor = false;
            funcoes_carro carro = new funcoes_carro(criador_carro, criador_motor);
            System.out.println(carro.getStatusCarro());
            while (true) {
                System.out.println("O que deseja realizar: ");
                System.out.println("");
                System.out.println("1 - Ligar carro");
                System.out.println("2 - Desligar carro");
                System.out.println("3 - status do carro");
                System.out.println("4 - Acelerar");
                System.out.println("5 - Desacelerar");
                System.out.println("6 - Verificar velocidade");
                System.out.println("7 - Engatar marcha");
                System.out.println("8 - Virar");

                var opcao = scanner.nextInt();
                
                if(opcao == 1){
                    carro.Motor(opcao);
                    continue;
                }
                else if(opcao == 2){
                    carro.Motor(opcao);
                    continue;
                }
                else if(opcao == 3){
                    System.out.println(carro.getStatusCarro());
                }
                else if(opcao == 4){
                    System.out.println("Qual a velocidade que deseja acelerar: ");
                    var velocidade = scanner.nextInt();
                    carro.getAcelerar(velocidade);
                }
                else if(opcao == 5){
                    System.out.println("Qual a velocidade que deseja desacelerar: ");
                    var velocidade = scanner.nextInt();
                    carro.getDesacelerar(velocidade);
                }
                else if(opcao == 6){
                    System.out.println("Sua velocidade é: "+ carro.getVelocidade());
                }else if(opcao == 7){
                    System.out.println("Deseja engatar o carro [1]Sim [2]Não");
                    var validador = scanner.nextInt();
                    if (validador == 1){
                        var engate = true;
                        carro.getMarcha(engate);
                    }else{
                        System.out.println("Algo deu errado, tente novamente.");
                    }
                }
                else if(opcao == 8){
                    System.out.println("Deseja virar para a [1]ESQUERDA ou [2]DIREITA");
                    var virar = scanner.nextInt();
                    carro.getVirar(virar);
                }
            }
        }
        else if(opcao_inicial == 2){
            System.out.println("Saindo do programa!");
        }
        else{
            System.out.println("Digitou a opção inválida!");
        }
    }
}
