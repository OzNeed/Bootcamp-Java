public non-sealed class ingresso_familia extends Ingresso{

    private double valor_familia;


    public double getValor_familia() {
        return valor_familia;
    }


    public void setValor_familia(double valor_familia) {
        this.valor_familia = valor_familia;
    }

    public void quantidade(int valor){
        if(valor == 3){
            valor_familia = getValor() * 3;
        }
        else if(valor > 3){
            var valor_por_pessoa = getValor() * valor;
            var valor_percentual = valor_por_pessoa * 0.05;
            valor_familia = valor_por_pessoa - valor_percentual;
        }
    }

}
