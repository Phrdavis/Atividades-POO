package questao1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Name {
    private ArrayList<String> user = new ArrayList<>();
    private ArrayList<Integer> pontos = new ArrayList<>();

    public PrintStream getUser(int i) {
        return (System.out.printf("%10s%5s%22s%3s\n", "|", user.get(i), pontos.get(i), "|"));
    }

    public void setUser(String user, int pontos) {
        this.user.add(user);
        this.pontos.add(pontos);
    }
    public ArrayList<String> getAllUser(){
        return this.user;
    }
    public ArrayList<Integer> getAllPoints(){
        return this.pontos;
    }

    public int getSize(){
        return this.user.size();
    }
}
