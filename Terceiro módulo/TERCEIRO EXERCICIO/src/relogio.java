public sealed class relogio permits brasileiro, americano{
    private int horas;
    private int minutos;
    private int segundos;

    public relogio(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String formatHoras(){
       return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
