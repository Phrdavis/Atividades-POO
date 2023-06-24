package questao4;

import java.util.ArrayList;

public class Juiz {
    private ArrayList<String> name  = new ArrayList<>();
    private ArrayList<String> nacio = new ArrayList<>();
    private ArrayList<Double> nota  = new ArrayList<>();

    public void setJuiz(String name, String nacio, double nota){
        this.name.add(name);
        this.nacio.add(nacio);
        this.nota.add(nota);
    }

    public String getName(int i) {
        return name.get(i);
    }

    public String getNacio(int i) {
        return nacio.get(i);
    }

    public double getNota(int i) {
        return nota.get(i);
    }

    public int getSize(){
        return this.name.size();
    }
}
