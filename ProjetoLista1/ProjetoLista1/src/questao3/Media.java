package questao3;

import java.util.ArrayList;

public class Media {
    private ArrayList<Double> mediaInd = new ArrayList<>();
    private double mediaTotal;

    public void setMediaInd(double peso, double nota) {
        this.mediaInd.add((peso * nota)/10);
    }

    public void setMediaTotal(int i){
        this.mediaTotal += this.mediaInd.get(i);
    }

    public double getMediaTotal(){
        return this.mediaTotal;
    }
}
