package Primeiro_Exercicio;

import java.util.Scanner;

public class Contabancaria {
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Primeiro iremos criar a sua conta.");
        System.out.println("Digite o seu nome:");
        var nome = scanner.next();
        System.out.println("Digite o valor que deseja depositar:");
        var saldo = scanner.nextDouble();
        
        account contabancaria = new account(nome, saldo);

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("-----O que deseja realizar------");
            System.out.println("--------------------------------");
            System.out.println("|  1. Consultar Saldo          |");
            System.out.println("|  2. Consultar cheque especial|");
            System.out.println("|  3. Depositar dinheiro       |");
            System.out.println("|  4. Sacar dinheiro           |");
            System.out.println("|  5. Pagar um boleto          |");
            System.out.println("|  6. Sair                     |");

            int operacao = scanner.nextInt();

            if (operacao == 1){
                System.out.println("Seu saldo é: " + contabancaria.getSaldo());
                continue;
            }
            else if(operacao == 2){
                System.out.println("Seu cheque especial é: " + contabancaria.getChequeEspecial());
                contabancaria.status();
                continue;
            }
            else if(operacao == 3){
                System.out.println("Digite o valor que deseja depositar:");
                Double deposito = scanner.nextDouble();
                contabancaria.depositar(deposito);
                continue;
            }
            else if(operacao == 4){
                System.out.println("Digite o valor que deseja retirar: ");
                Double retirar = scanner.nextDouble();
                contabancaria.sacar(retirar);
                continue;
            }
            else if(operacao == 5){
                System.out.println("Scanneando o código de barra!");
                System.out.println("Qual valor deseja pagar: ");
                Double valor = scanner.nextDouble();
                contabancaria.pagarconta(valor);
                continue;
            }
            else{
                System.out.println("Você saiu da sua conta");
                break;
            }
        }
    }   
}
