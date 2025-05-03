public final class Atendente extends Employee{

    private Float caixa = 0.0f;
    private String fechar_caixa;
    private String realizar_login;
    private String realizar_logoff;
    private String alterar_dados;
    private String alterar_senha;
    
    public Float getCaixa() {
        return caixa;
    }
    public void setCaixa(Float caixa) {
        this.caixa = caixa;
    }
    public String getFechar_caixa() {
        fechar_caixa = "O valor no fechamento do caixa é: " + this.caixa;
        return fechar_caixa;
    }
    public void setFechar_caixa(String fechar_caixa) {
        this.fechar_caixa = fechar_caixa;
    }

    public String getRealizar_login() {
        realizar_login = "========================\nRealizando login \n========================";
        return realizar_login;
    }
    public void setRealizar_login(String realizar_login) {
        this.realizar_login = realizar_login;
    }
    public String getRealizar_logoff() {
        realizar_logoff = "========================\nRealizando log-off \n========================";
        return realizar_logoff;
    }
    public void setRealizar_logoff(String realizar_logoff) {
        this.realizar_logoff = realizar_logoff;
    }
    public String getAlterar_dados() {
        alterar_dados = "========================\nAlterando dados \n========================";
        return alterar_dados;
    }
    public void setAlterar_dados(String alterar_dados) {
        this.alterar_dados = alterar_dados;
    }
    public String getAlterar_senha() {
        alterar_senha = "========================\nalterando senha \n========================";
        return alterar_senha;
    }
    public void setAlterar_senha(String alterar_senha) {
        this.alterar_senha = alterar_senha;
    }

    public void entrada_caixa(Float valor){
        this.caixa += valor;
    }

    public void fechar_caixa(boolean valor){
        this.caixa -= this.caixa;
    }
}
