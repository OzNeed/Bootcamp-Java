package Terceiro_Exercicio;

public class funcoes_pet_shop {
    private int agua;
    private int shampoo;
    private Boolean maquina;
    private Boolean maquina_suja;


    public funcoes_pet_shop(int agua, int shampoo){
        this.agua = agua;
        this.shampoo = shampoo;
        this.maquina = false;
        this.maquina_suja = false;
    }


    public void status_maquina(Boolean valor){
        if(this.maquina == true){
            System.out.println("Contém pet na maquina");
        }
        else if(this.maquina == false){
            System.out.println("Não há pet na maquina");
            if(this.maquina_suja == true){
                System.out.println("Porém a maquina está suja");
            }
            else if(this.maquina == false){
                System.out.println("Maquina não está suja");
            }
        }
    }

    public void banho_maquina_vazia(Boolean valor){
        if(this.agua >= 10 && this.shampoo >=2){
            if(this.maquina == true){
                System.out.println("Retirar animal que está na maquina antes");

            }
            else if(this.maquina_suja == true){
                System.out.println("Limpar maquina antes de colocar outro animal");
            }
            else if(this.maquina == false && this.maquina_suja == false){
                this.maquina = true;
                System.out.println("Dando banho no pet");
                this.agua -= 10;
                this.shampoo -= 2;
            }
        }else{
            System.out.println("Necessário abastecer os recipientes");
        }  
    }
    public void pos_banho(Boolean valor){
        if(this.maquina == true){
            this.maquina_suja = true;
            this.maquina = false;
            System.out.println("Retirado pet da maquina");
            System.out.println("Maquina ficou suja, necessário limpar");
        }
        else if(this.maquina == false){
            System.out.println("Não há pet na maquina para retirar");
        }
    }
    public void status_recipientes(Boolean valor){
        System.out.println("Recipiente de água contém: " + this.agua + "Litros - Sendo possível realizar " + this.agua/10 + " banhos");
        System.out.println("Recipiente de shampoo contém: " + this.shampoo + "Litros- Sendo possível realizar " + this.agua/10 + " banhos");
            if(this.agua < 10){
                System.out.println("Necessário realizar o abastecimento de água");
            }
            else if(this.shampoo < 2){
                System.out.println("Necessário realizar o abastecimento de shampoo");
            }
            else if(this.agua < 10 && this.shampoo < 2){
                System.out.println("Necessário realizar o abertimento de todos os recipientes");
            }
    }
    public void abastecer_agua(int valor){
        if (this.agua == 30){
            System.out.println("Recipiente está cheio");
        }else if (this.agua > 0 && this.agua <30){
            while (this.agua < 30 && valor > 0) {
                this.agua +=1;
                valor -= 1;
            }
            System.out.println("O recipiente contem " + this.agua + "Litros após o abastecimento");
        }else{
            System.out.println("Algo deu errado");
        }
    }
    public void abastecer_shampoo(int valor){
        if (this.shampoo == 10){
            System.out.println("Recipiente está cheio");
        }else if (this.shampoo > 0 && this.shampoo <10){
            while (this.shampoo < 10 && valor > 0) {
                this.shampoo +=1;
                valor -= 1;
            }
            System.out.println("O recipiente contem " + this.shampoo + "Litros após o abastecimento");
        }else{
            System.out.println("Algo deu errado");
        }
    }

    public void limpeza(Boolean valor){
        if(this.agua >= 3 && this.shampoo >=1){
            System.out.println("Realizando limpeza na maquina");
            this.maquina_suja = false;
            this.agua -= 3;
            this.shampoo -= 1;
        }else{
            System.out.println("Reabasteça os recipientes");
        }

    }
}