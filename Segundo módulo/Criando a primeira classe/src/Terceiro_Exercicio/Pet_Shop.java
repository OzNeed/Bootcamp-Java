package Terceiro_Exercicio;

import java.util.Scanner;

public class Pet_Shop {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        funcoes_pet_shop pet_shop = new funcoes_pet_shop(30, 10);

        while(true){
            System.out.println("------------------------------------");
            System.out.println("O que deseja fazer");
            System.out.println("1 - Dar banho");
            System.out.println("2 - Verificar níveis dos recipentes");
            System.out.println("3 - Abastercer  recipientes");
            System.out.println("4 - Verificar se há pet na maquina");
            System.out.println("5 - Sair");

            var opcao = scanner.nextInt();

            if(opcao == 1){
                while(true){
                    System.out.println("1 - Verificar se tem animal na maquina");
                    System.out.println("2 - colocar na máquina");
                    System.out.println("3 - retirar da máquina");
                    System.out.println("4 - Limpar máquina");
                    var opcao_section = scanner.nextInt();
                    if(opcao_section == 1){
                        pet_shop.status_maquina(true);
                    }
                    else if(opcao_section == 2){
                        pet_shop.banho_maquina_vazia(true);
                    }
                    else if(opcao_section == 3){
                        pet_shop.pos_banho(true);
                        break;
                    }else if(opcao_section == 4){
                        pet_shop.limpeza(true);
                    }
                }

            }
            else if(opcao == 2){
                pet_shop.status_recipientes(true);
            }
            else if(opcao == 3){
                System.out.println("1 - Abastecer água");
                System.out.println("2 - Abastecer shampoo");
                System.out.println("3 - Abastecer tudo");
                var opcao_section = scanner.nextInt();
                if(opcao_section == 1){
                    pet_shop.abastecer_agua(10);
                }
                if(opcao_section == 2){
                    pet_shop.abastecer_shampoo(2);
                }
                if(opcao_section == 3){
                    pet_shop.abastecer_agua(10);
                    pet_shop.abastecer_shampoo(2);
                }
            }
            else if(opcao == 4){
                var valor = true;
                pet_shop.status_maquina(valor);
            }
            else if(opcao == 5){
                System.out.println("Saindo do programa");
                break;
            }
        }
    }
}