public non-sealed class americano extends relogio{

    public americano(int horas, int minutos, int segundos) {
        super(horas, minutos, segundos);
    }

    public String formatHoras(){
        if (getHoras() <= 12) {
            return String.format("%02dAM:%02d:%02d", getHoras(), getMinutos(), getSegundos());
        }
        else if(getHoras() >= 13){
            setHoras(getHoras() - 12);
            return String.format("%02dPM:%02d:%02d", getHoras(), getMinutos(), getSegundos());
        }
        return null;
    }
}
