package Primeiro_Exercicio;

public class account {

    private String name;
    private Double saldo;
    private Double chequeespecial;


    public account(String name, Double saldo){
        this.name = name;
        this.saldo = saldo;
        this.chequeespecial = 0.0;
        chequeespecial();
    }
    
    public String getName(){
        return name;
    }
    public Double getSaldo(){
        return saldo;
    }
    
    public Double getChequeEspecial(){
        return chequeespecial;
    }

    private void chequeespecial(){
        if (this.saldo > 500.00){
            this.chequeespecial = this.saldo * 0.50;
        }else{
            this.chequeespecial = 50.00;
        }
        this.saldo += this.chequeespecial;
    }

    public void depositar(Double valor){
        if (valor > 0){
            if(this.saldo < this.chequeespecial){
                Double newValor = (this.saldo - this.chequeespecial) + valor;
                this.saldo += newValor;
                System.out.println("Valor depositado");
                if(valor > 500){
                    chequeespecial();
                }
            }else if(this.saldo > this.chequeespecial){
                this.saldo += valor;
                System.out.println("Valor depositado");
                chequeespecial();
            }
        }else{
            System.out.println("Não foi possivel depositar o valor!");
        }
    }

    public void sacar(Double valor){
        if(valor > 0){
            if(valor < this.saldo){
            this.saldo -= valor;
                if(this.saldo < this.chequeespecial){
                    Double utilizado = this.chequeespecial - this.saldo;
                    Double taxa = utilizado * 0.20;
                    this.saldo -= taxa;
                }
            System.out.println("Valor retirado com sucesso!");
        }
    }else{
        System.out.println("Não foi possivel retirar o valor!");
    }
    }
    

    public void pagarconta(Double valor){
        if(valor > 0){
            this.saldo = this.getSaldo() - valor;
            System.out.println("Boleto pago com sucesso");
        }else{
            System.out.println("Ocorreu um erro ao pagar o boleto!");
        }
    }
    public void status(){
        if (saldo > this.chequeespecial){
            System.out.println("Não está utilizando o cheque especial");
        }
        else if(saldo < this.chequeespecial){
            Double utilizado = this.chequeespecial - this.saldo;
            Double taxa = utilizado * 0.20;
            this.saldo -= taxa;
            System.out.println("Está usando o cheque especial");
            System.out.println("O valor que está sendo usado do seu cheque especial é: "+ utilizado);
            System.out.println("O valor a seguir foi descontado pela utilização do cheque especial: "+taxa);
        }
        else{
            System.out.println("Algo deu errado");
        }
    }
}