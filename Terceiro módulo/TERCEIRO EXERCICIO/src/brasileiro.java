public non-sealed class brasileiro extends relogio{

    public brasileiro(int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
    }

    public String horaBrasil(){
        return this.formatHoras();
    }

}
