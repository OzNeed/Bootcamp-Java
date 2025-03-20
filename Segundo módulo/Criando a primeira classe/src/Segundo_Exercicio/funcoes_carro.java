package Segundo_Exercicio;

public class funcoes_carro {
    private Boolean carro_oficial;
    private Boolean motor;
    private int marcha;
    private int velocidade;

    public funcoes_carro(Boolean carro_oficial, Boolean motor){
        this.carro_oficial = carro_oficial;
        this.motor = motor;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public String getStatusCarro(){
        String statuscarro = "Status do Carro \n";
        statuscarro += "Carro criado: " + (carro_oficial ? "Sim" : "Não") + "\n";
        statuscarro += "Motor ligado: " + (motor ? "Sim" : "Não") + "\n";
        statuscarro += "Marcha atual: " + this.marcha + "\n";
        statuscarro += "Velocidade atual: " + this.velocidade + "\n";
        return statuscarro;
    }

    public void Motor(int valor){
        if(valor == 1){
            if(this.motor == false){
                this.motor = true;
                System.out.println("Motor ligado!");
            }
            else{
                System.out.println("Moto já está ligado");
            }
        }else if(valor == 2){
            if(this.velocidade >= 1){
                System.out.println("O motor não pode ser desligado em movimento");
            }
            else if(this.velocidade == 0 && this.marcha == 0){
                this.motor = false;
                System.out.println("Motor desligado.");
            }
            else{
                System.out.println("Motor já está desligado");
            }
        }else{
            System.out.println("Valor inválido, digite 1 ou 2 para executar uma ação");
        }
    }

    public void getAcelerar(int valor){
        if(this.marcha >= 1){
            while (this.velocidade < 120 && valor > 0) {
                this.velocidade++;
                valor--;
                if (this.velocidade == 20) {
                    System.out.println("Acelerando e engatando segunda marcha");
                    this.marcha = 2;
                } else if (this.velocidade == 40) {
                    System.out.println("Acelerando e engatando terceira marcha");
                    this.marcha = 3;
                } else if (this.velocidade == 60) {
                    System.out.println("Acelerando e engatando quarta marcha");
                    this.marcha = 4;
                } else if (this.velocidade == 80) {
                    System.out.println("Acelerando e engatando quinta marcha");
                    this.marcha = 5;
                } else if (this.velocidade == 100) {
                    System.out.println("Acelerando e engatando sexta marcha");
                    this.marcha = 6;
                }
                if (this.velocidade == 120) {
                    System.out.println("Velocidade máxima atingida!");
                    break;
                }
            }
        }else if(this.marcha == 0){
            System.out.println("Engate a primeira marcha!");
        }
        else{
            System.out.println("Algo deu errado!");
        }
    }    

    public void getDesacelerar(int valor){
        if(this.velocidade == 0){
            System.out.println("O carro já está parado");
        }else if(this.velocidade > 1){
            while (this.velocidade < 120 && valor > 0) {
                this.velocidade--;
                valor--;
                if(this.velocidade == 0){
                    System.out.println("Carro parou e engatando neutro!");
                    this.marcha = 0;
                } 
                if (this.velocidade == 20) {
                    System.out.println("Desacelarnado e engatando primeira marcha");
                    this.marcha = 1;
                } else if (this.velocidade == 40) {
                    System.out.println("Desacelarnado e engatando segunda marcha");
                    this.marcha = 2;
                } else if (this.velocidade == 60) {
                    System.out.println("Desacelarnado e engatando terceira marcha");
                    this.marcha = 3;
                } else if (this.velocidade == 80) {
                    System.out.println("Desacelarnado e engatando quarta marcha");
                    this.marcha = 4;
                } else if (this.velocidade == 100) {
                    System.out.println("Desacelarnado e engatando quinta marcha");
                    this.marcha = 5;
                }
                if (this.velocidade == 120) {
                    System.out.println("Velocidade máxima atingida!");
                    break;
                }
            }
        }else{
            System.out.println("Algo deu errado");
        }
    }

    public void getMarcha(Boolean valor){
        if(valor == true){
            this.marcha += 1;
            System.out.println("Engata a primeira marcha");
        }else{
            System.out.println("Algo deu errado");
        }
    }

    public void getVirar(int valor){
        if(valor == 1){
            if(this.velocidade >= 1 || this.velocidade <= 40){
                System.out.println("Virando a Esquerda");
            }
        }else if(valor == 2){
            if(this.velocidade >= 1 || this.velocidade <= 40){
                System.out.println("Virando a Direita");
            }
        }else{
            System.out.println("Algo deu errado.");
        }
    }
}  