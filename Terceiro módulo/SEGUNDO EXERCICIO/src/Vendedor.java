public final class Vendedor extends Employee{

    private int vendas = 0;
    private int consultar_vendas = 0;
    private String ralizar_login;
    private String ralizar_logoff;
    private String alterar_dados;
    private int alterar_senha;

    public int getVendas() {
        return vendas;
    }
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    public int getConsultar_vendas() {
        consultar_vendas += vendas;
        return consultar_vendas;
    }
    public void setConsultar_vendas(int consultar_vendas) {
        this.consultar_vendas = consultar_vendas;
    }
    public String getRalizar_login() {
        return ralizar_login;
    }
    public void setRalizar_login(String ralizar_login) {
        this.ralizar_login = ralizar_login;
    }
    public String getRalizar_logoff() {
        return ralizar_logoff;
    }
    public void setRalizar_logoff(String ralizar_logoff) {
        this.ralizar_logoff = ralizar_logoff;
    }
    public String getAlterar_dados() {
        return alterar_dados;
    }
    public void setAlterar_dados(String alterar_dados) {
        this.alterar_dados = alterar_dados;
    }
    public int getAlterar_senha() {
        return alterar_senha;
    }
    public void setAlterar_senha(int alterar_senha) {
        this.alterar_senha = alterar_senha;
    }

    public void novas_vendas(int vendas){
        this.vendas += vendas;
    }
}
