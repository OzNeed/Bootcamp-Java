public class Salasman extends Employee{
    private double percentPerSold;
    private double soldAmount;

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

    public double getFullSalry() {
        return this.salary + (soldAmount * percentPerSold /100);
    }

    public double getFullSalry(double extra){
        return this.getFullSalry() + extra;
    }
}
