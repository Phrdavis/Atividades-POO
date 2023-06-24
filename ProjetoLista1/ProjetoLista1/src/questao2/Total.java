package questao2;

import java.util.ArrayList;

public class Total {
    private ArrayList<Double> ttUni = new ArrayList<>();
    private double totalFinal;

    public void setTtUni(int i, double ttUni) {
        this.ttUni.add(ttUni * i);
    }

    public Double getTtUni(int i) {
        return ttUni.get(i);
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal += totalFinal;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public int getSize(){
        return this.ttUni.size();
    }
}
