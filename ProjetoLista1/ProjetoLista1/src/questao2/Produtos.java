package questao2;

import java.util.ArrayList;

public class Produtos {
    private ArrayList<String> produto = new ArrayList<>();
    private ArrayList<Integer> qtde = new ArrayList<>();
    private ArrayList<Double> vu = new ArrayList<>();

    public void setProduto(String produto, int qtde, double vu) {
        this.produto.add(produto);
        this.qtde.add(qtde);
        this.vu.add(vu);
    }

    public String getProduto(int i) {
        return this.produto.get(i);
    }

    public Integer getQtde(int i) {
        return this.qtde.get(i);
    }


    public Double getVu(int i) {
        return this.vu.get(i);
    }

    public int getSize(){
        return this.produto.size();
    }

}
