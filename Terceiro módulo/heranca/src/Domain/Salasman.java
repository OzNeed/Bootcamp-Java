package Domain;

public non-sealed class Salasman extends Employee{
    private double percentPerSold;
    private double soldAmount;

    public Salasman(String code, String name, String address, int age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode(){
        
        return "SL" + this.code;
    }

    public Salasman(){
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalry() {
        return this.salary + (soldAmount * percentPerSold /100);
    }
}
