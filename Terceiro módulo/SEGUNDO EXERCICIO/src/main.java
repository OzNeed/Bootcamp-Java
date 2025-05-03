import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
            Gerente gerente = new Gerente();
            Vendedor vendedor = new Vendedor();
            Atendente atendente = new Atendente();

            System.out.println("Qual funcionario desseja realizar o cadastro");
            System.out.println("1 - Gerente");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Atendente");
            System.out.println("4 - Sair");

            var escolha = scanner.nextInt();

            if (escolha == 1){
                while (true) {                    
                    System.out.println("Digite o nome do gerente: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    gerente.setNome(name);
                    System.out.println("Digite o primeiro nome do gerente:");
                    var primeiro_nome = scanner.next();
                    gerente.setEmail(primeiro_nome + "@gmail.com");
                    System.out.println("Digite uma senha:");
                    var senha = scanner.next();
                    gerente.setSenha(senha);
                    gerente.setAdministrador(true);

                    System.out.println("======================================");
                    System.out.println("Deseja realizar o login [1]Sim [2]Não");
                    System.out.println("======================================");
                    var new_escolha = scanner.nextInt();
    
                    if(new_escolha == 1){
                        System.out.println(gerente.getRealizar_login());
                        while (true) {
                            System.out.println("======================================");
                            System.out.println("Dados do usuário");
                            System.out.println("Nome: " + gerente.getNome());
                            System.out.println("E-mail: " + gerente.getEmail());
                            System.out.println("Administrador: " + gerente.isAdministrador());
                            System.out.println("======================================");
                            System.out.println("O que deseha fazer:");
                            System.out.println("1 - Gerar relatório financeiro");
                            System.out.println("2 - Consultar vendas");
                            System.out.println("3 - alterar dados");
                            System.out.println("4 - alterar senha");
                            System.out.println("5 - Realizar log-off");
                            var choice = scanner.nextInt();

                            if(choice == 1){
                                System.out.println(gerente.getRelatorio());
                                continue;
                            }
                            else if(choice == 2){
                                System.out.println(gerente.getConsultar_venda());
                                continue;
                            }
                            else if(choice == 3){
                                System.out.println(gerente.getAlterar_dados());
                                continue;
                            }
                            else if(choice == 4){
                                System.out.println(gerente.getAlterar_senha());
                                continue;
                            }
                            else if(choice == 5){
                                System.out.println(gerente.getRealizar_logoff());
                                break;
                            }
                            else{
                                System.out.println("Selecione uma opção válida");
                                continue;
                            }
                        }
                        break;
                    }
                    else if(new_escolha == 2){
                        System.out.println("Voltando ao menu principal!");
                        break;
                    }
                    else{
                        System.out.println("Escolha incorreta, voltando ao menu principal");
                        break;
                    }

                }
            }
            else if(escolha == 2){
                while (true) {
                    System.out.println("Digite o nome do vendedor:");
                    scanner.nextLine();
                    var name = scanner.nextLine();
                    vendedor.setNome(name);
                    System.out.println("Digite o primeiro nome do vendedor:");
                    var primeiro_nome = scanner.next();
                    vendedor.setEmail(primeiro_nome + "@gmail.com");
                    System.out.println("Digite uma senha:");
                    var senha = scanner.next();
                    vendedor.setSenha(senha);
                    vendedor.setAdministrador(false);

                    System.out.println("======================================");
                    System.out.println("Deseja realizar o login [1]Sim [2]Não");
                    System.out.println("======================================");
                    var new_escolha = scanner.nextInt();

                    if(new_escolha == 1){
                        System.out.println(vendedor.getRalizar_login());
                        while (true) {
                            System.out.println("======================================");
                            System.out.println("Dados do usuário");
                            System.out.println("Nome: " + vendedor.getNome());
                            System.out.println("E-mail: " + vendedor.getEmail());
                            System.out.println("Administrador: " + vendedor.isAdministrador());
                            System.out.println("======================================");
                            System.out.println("O que deseja fazer:");
                            System.out.println("1 - Vendas");
                            System.out.println("2 - Consultar vendas");
                            System.out.println("3 - alterar dados");
                            System.out.println("4 - alterar senha");
                            System.out.println("5 - Realizar log-off");

                            var choice = scanner.nextInt();

                            if (choice == 1) {
                                System.out.println("Quantas vendas deseja inserir:");
                                var vendas = scanner.nextInt();
                                vendedor.novas_vendas(vendas);
                                System.out.println("Foram inseridas " + vendedor.getVendas() + " em seu cadastro");
                            }
                            else if(choice == 2){
                                System.out.println("======================================");                           
                                System.out.println("O vendedor possui: " + vendedor.getConsultar_vendas() + " vendas");
                                System.out.println("======================================");
                            }
                            else if(choice == 3){                                
                                System.out.println(vendedor.getAlterar_dados());
                            }
                            else if(choice == 4){                                
                                System.out.println(vendedor.getAlterar_senha());
                                continue;
                            }
                            else if(choice == 5){                                
                                System.out.println(vendedor.getRalizar_logoff());
                                break;
                            }
                        }
                        break;
                    }
                    else if (new_escolha == 2) {
                        System.out.println("Voltando ao menu principal!");
                        break;
                    }
                    else{
                        System.out.println("Escolha incorreta, voltando ao menu principal");
                        break;
                    }
                }
            }
            else if(escolha == 3){
                while (true) {
                    System.out.println("Digite o nome do atendente:");
                    scanner.nextLine();
                    var name = scanner.nextLine();
                    atendente.setNome(name);
                    System.out.println("Digite o primeiro nome do atendente:");
                    var primeiro_nome = scanner.next();
                    atendente.setEmail(primeiro_nome + "gmail.com");
                    System.out.println("Digite uma senha:");
                    var senha = scanner.next();
                    atendente.setSenha(senha);
                    atendente.setAdministrador(false);

                    System.out.println("======================================");
                    System.out.println("Deseja realizar o login [1]Sim [2]Não");
                    System.out.println("======================================");
                    var new_escolha = scanner.nextInt();

                    if(new_escolha == 1){
                        System.out.println(atendente.getRealizar_login());
                        while (true) {
                        System.out.println("======================================");
                        System.out.println("Dados do usuário");
                        System.out.println("Nome: " + atendente.getNome());
                        System.out.println("E-mail: " + atendente.getEmail());
                        System.out.println("Administrador: " + atendente.isAdministrador());
                        System.out.println("======================================");
                        System.out.println("O que deseja fazer:");
                        System.out.println("1 - Adicionar valor em caixa");
                        System.out.println("2 - Fechar caixa");
                        System.out.println("3 - alterar dados");
                        System.out.println("4 - alterar senha");
                        System.out.println("5 - Realizar log-off");
                        
                        var choice = scanner.nextInt();

                        if (choice == 1){
                            System.out.println("Digite o valor que deseja inserir no caixa:");
                            float valor = scanner.nextFloat();
                            atendente.entrada_caixa(valor);
                            System.out.println("======================================");
                            System.out.println("Foi adicionado o valor no caixa");
                            System.out.println("======================================");
                        }
                        else if(choice == 2){
                            atendente.fechar_caixa(true);
                            System.out.println("Caixa foi fechado");
                        }
                        else if(choice == 3){                                
                            System.out.println(atendente.getAlterar_dados());
                        }
                        else if(choice == 4){                                
                            System.out.println(atendente.getAlterar_senha());
                            continue;
                        }
                        else if(choice == 5){                                
                            System.out.println(atendente.getRealizar_logoff());
                            break;
                        }
                        }
                        break;
                    }
                    else if (new_escolha == 2) {
                        System.out.println("Voltando ao menu principal!");
                        break;
                    }
                    else{
                        System.out.println("Escolha incorreta, voltando ao menu principal");
                        break;
                    }
                }
            }
            else if (escolha == 4){
                System.out.println("Saindo do programa");
                break;
            }
            else{
                System.out.println("Escolha uma opção válida!");
                continue;
            }
        }   
    }
}
