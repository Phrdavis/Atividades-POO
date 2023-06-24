package questao4;

public class Total {

    private double notaTotal;

    public void setNotaTotal(double i){
        notaTotal += i;
    }
    public double getTotal(int i){
        return this.notaTotal/i;
    }
}
