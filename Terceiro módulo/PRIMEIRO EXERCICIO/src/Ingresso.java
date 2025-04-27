public sealed class Ingresso permits meia_entrada, ingresso_familia{
    
    private double valor;
    private String nome_do_filme;
    private String audio;

    public double getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public String getNome_do_filme() {
        return nome_do_filme;
    }
    public void setNome_do_filme(String nome_do_filme) {
        this.nome_do_filme = nome_do_filme;
    }
    public String getAudio() {
        return audio;
    }
    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void filme(int opcao){
        if (opcao == 1){
        nome_do_filme = "Velozes e furiosos";
        }
        else if(opcao == 2){
            nome_do_filme = "Jogos Vorazes";
        }
        else if(opcao == 3){
            nome_do_filme = "Jogador Nº1";
        }
        else if(opcao == 4){
            nome_do_filme = "Invocação do mal";
        }
    }

    public void audio(int opcao){
        if(opcao == 1){
            audio = "Dublado";
            valor = 15;
        }
        else if(opcao == 2){
            audio = "Legendado";
            valor = 25;
        }
    }

}
