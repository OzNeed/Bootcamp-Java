public non-sealed class Gerente extends Employee{

    private String relatorio;
    private String consultar_venda;
    private String realizar_login;
    private String realizar_logoff;
    private String alterar_dados;
    private String alterar_senha;

    public String getRelatorio() {
        relatorio = "========================\nExibindo relatório \n========================";
        return relatorio;
    }
    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    public String getConsultar_venda() {
        consultar_venda = "========================\nExibindo vendas \n========================";
        return consultar_venda;
    }
    public void setConsultar_venda(String consultar_venda) {
        this.consultar_venda = consultar_venda;
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

}
