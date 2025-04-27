public class Manager extends Employee{
    private String login;
    private String password;
    private double comission;

    public String getCode(){
        
        return "MN" + this.code;
    }

    public Manager(){

    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getComission() {
        return comission;
    }
    public void setComission(double comission) {
        this.comission = comission;
    }

    public double getFullSalry() {
        return this.salary + this.comission;
    }

    public double getFullSalry(double extra){
        return this.getFullSalry() + extra;
    }
    /* Esse método acima e um sobrecarga */

}
