package questao3;

import java.util.ArrayList;
import java.util.HashMap;

public class Atividade {
    private HashMap<Integer, String> ativ = new HashMap<>();
    private ArrayList<Double> peso = new ArrayList<>();
    private ArrayList<Double> nota = new ArrayList<>();


    public void setAtiv(int i, String ativ, double peso, double nota) {
        this.ativ.put(i, ativ);
        this.peso.add(peso);
        this.nota.add(nota);
    }

    public String getAtiv(int i) {
        return ativ.get(i);
    }
    public double getPeso(int i) {
        return peso.get(i);
    }
    public double getNota(int i) {
        return nota.get(i);
    }

    public int getSize(){
        return this.ativ.size();
    }
}
