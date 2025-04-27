public non-sealed class meia_entrada extends Ingresso{

    private Double real_valor;

    public Double getReal_valor() {
        return real_valor;
    }

    public void setReal_valor(Double real_valor) {
        this.real_valor = real_valor;
    }

    public void Fullvalor() {
        this.real_valor = getValor()/2;
    }

}
