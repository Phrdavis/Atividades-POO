import questao1.Name;
import questao2.*;
import questao3.*;
import questao4.*;
import questao4.Total;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        QUESTÃO 1 LISTA DE COLEÇÕES


//        Name name = new Name();
//        name.setUser("ABC", 1000000);
//        name.setUser("BCD", 100000);
//        name.setUser("CDE", 10000);
//        name.setUser("DEF", 1000);
//        name.setUser("EFG", 100);
//        name.setUser("FGH", 10);
//        name.setUser("GHJ", 1);
//
//        System.out.printf("%40s\n", "-------------------------------");
//        System.out.printf("%10s%20s%10s\n", "|", "Game Over", "|");
//        System.out.printf("%40s\n", "-------------------------------");
//        System.out.printf("%10s%21s%9s\n", "|", "High Scores", "|");
//
//        for(int i = 0; i <= name.getSize() - 1; i++){
//            name.getUser(i);
//        }
//
//        System.out.printf("%40s\n", "-------------------------------");

//        QUESTÃO 2 LISTA DE COLEÇÕES

//        Produtos produto = new Produtos();
//        Total total = new Total();
//
//        produto.setProduto("Caneta", 2, 3);
//        produto.setProduto("Lapis", 3, 2);
//        produto.setProduto("Borracha", 5, 1);
//        produto.setProduto("Carderno", 2, 15);
//        produto.setProduto("Mochila", 1, 30);
//        produto.setProduto("Clipes", 30, 0.5);
//
//        for(int i = 0; i <= produto.getSize()-1; i++){
//            total.setTtUni(produto.getQtde(i), produto.getVu(i));
//        }
//        for(int i = 0; i <= total.getSize()-1; i++){
//            total.setTotalFinal(total.getTtUni(i));
//        }
//
//        System.out.printf("%66s\n", "---------------------------------------------------------");
//        System.out.printf("%10s%31s%25s\n", "|", "COMPRA", "|");
//        System.out.printf("%66s\n", "---------------------------------------------------------");
//        System.out.printf("%10s%10s%13s%16s%14s%3s\n", "|", "Produto", "Qtde", "V. Unit.", "Total", "|");
//        System.out.printf("%66s\n", "---------------------------------------------------------");
//        for (int i = 0; i <= total.getSize() - 1; i++){
//            System.out.printf("%10s%2s%8s%13d       R$%6.2f       R$%6.2f%3s\n", "|", "", produto.getProduto(i), produto.getQtde(i), produto.getVu(i), total.getTtUni(i), "|");
//        }
//        System.out.printf("%66s\n", "---------------------------------------------------------");
//        System.out.printf("%10s%10sR$%10.2f%34s\n", "|", "Total: ", total.getTotalFinal(), "|");
//        System.out.printf("%66s\n", "---------------------------------------------------------");


//        QUESTÃO 3

//        Atividade ativ = new Atividade();
//        Media media = new Media();
//
//
//        ativ.setAtiv(0,"A", 3, 10);
//        ativ.setAtiv(1,"B", 3, 8);
//        ativ.setAtiv(2,"C", 2, 2);
//        ativ.setAtiv(3,"D", 1, 9);
//        ativ.setAtiv(4,"E", 1, 10);
//
//        System.out.printf("%70s\n", "-------------------------------------------------------------");
//        System.out.printf("%10s%45s%15s\n" ,"|", "PROGRAMAÇÃO ORIENTADA À OBJETOS", "|");
//        System.out.printf("%10s%10s%25s%20s%5s\n", "|","Atividade", "Peso", "Nota", "|");
//        System.out.printf("%70s\n", "-------------------------------------------------------------");
//
//        for (int i = 0; i <= ativ.getSize() - 1; i++){
//            media.setMediaInd(ativ.getPeso(i), ativ.getNota(i));
//            media.setMediaTotal(i);
//
//            System.out.printf("%10s%7s%3s%25s%20s%5s\n", "|","Prova ", ativ.getAtiv(i), ativ.getPeso(i), ativ.getNota(i), "|");
//        }
//
//        System.out.printf("%70s\n", "-------------------------------------------------------------");
//        System.out.printf("%10s%12S%43.2f%5s\n", "|","MÉDIA FINAL", media.getMediaTotal(), "|");
//        System.out.printf("%70s\n", "-------------------------------------------------------------");


//        QUESTÃO 4

//        Juiz juiz = new Juiz();
//        Total total = new Total();
//
//        double maior = 0;
//        double menor = 0;
//
//        juiz.setJuiz("A", "USA", 10.00);
//        juiz.setJuiz("B", "AUS", 9.00);
//        juiz.setJuiz("C", "POR", 1.00);
//        juiz.setJuiz("D", "MEX", 5.00);
//        juiz.setJuiz("E", "JAP", 8.78);
//
//        System.out.printf("%45s\n", "------------------------------------");
//        System.out.printf("%10s%25s%10s\n","|", "Gabriel Medina", "|");
//        System.out.printf("%10s%35s\n","|", "|");
//        System.out.printf("%10s%6s%14s%13s%2s\n","|", "JUIZ", "NACIO.", "NOTA.","|");
//        System.out.printf("%45s\n", "------------------------------------");
//
//        for (int i = 0; i <= juiz.getSize() - 1; i++){
//            if (i == 0){
//                maior = juiz.getNota(i);
//                menor = maior;
//            }else if(juiz.getNota(i) > maior){
//                maior = juiz.getNota(i);
//            } else if(juiz.getNota(i) < menor) {
//                menor = juiz.getNota(i);
//            }
//        }
//
//        for (int i = 0; i <= juiz.getSize() - 1; i++){
//
//            if(juiz.getNota(i) == menor || juiz.getNota(i) == maior){
//                System.out.printf("%10s%4s%15s%14s%2s\n", "|", juiz.getName(i), juiz.getNacio(i), juiz.getNota(i)+"*","|");
//            }else{
//                total.setNotaTotal(juiz.getNota(i));
//                System.out.printf("%10s%4s%15s%14s%2s\n", "|", juiz.getName(i), juiz.getNacio(i), juiz.getNota(i),"|");
//            }
//        }
//
//        System.out.printf("%45s\n", "------------------------------------");
//        System.out.printf("%10s%12s%21.2f%2s\n","|", "NOTA FINAL", total.getTotal(juiz.getSize() - 2),"|");
//        System.out.printf("%45s\n", "------------------------------------");

//        QUESTÃO 5

//        FALTA DESENCRYPTOGRAFAR

//        Site: toCharArray()
//        https://www.techiedelight.com/pt/convert-string-list-characters-java/

        ArrayList<Character> alfa = new ArrayList<>();
        ArrayList<Character> alfaAlt = new ArrayList<>();
        ArrayList<Character> character = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        char aux;


        System.out.println("Digite seu texto:");
        String original = scan.nextLine().toUpperCase();

        System.out.println("Digite a chave da cifra: ");
        int key = scan.nextInt();



        alfa.add('A');
        alfa.add('B');
        alfa.add('C');
        alfa.add('D');
        alfa.add('E');
        alfa.add('F');
        alfa.add('G');
        alfa.add('H');
        alfa.add('I');
        alfa.add('J');
        alfa.add('K');
        alfa.add('L');
        alfa.add('M');
        alfa.add('N');
        alfa.add('O');
        alfa.add('P');
        alfa.add('Q');
        alfa.add('R');
        alfa.add('S');
        alfa.add('T');
        alfa.add('U');
        alfa.add('V');
        alfa.add('W');
        alfa.add('X');
        alfa.add('Y');
        alfa.add('Z');

        for (int i = 0; i < alfa.size(); i++){
            alfaAlt.add(i, alfa.get(i));
        }


        for(char element: original.toCharArray()){
            character.add(element);
        }

        for (int i = 0; i < key; i++){
            for (int j = 0; j < alfaAlt.size() - 1; j++){
                aux = alfaAlt.get(j);
                alfaAlt.set(j, alfaAlt.get(j + 1));
                alfaAlt.set(j + 1, aux);

            }
        }
        for (int j = 0; j < character.size(); j++) {
            for (int x = 0; x < alfa.size() - 1; x++) {
                if (character.get(j) == alfa.get(x)) {
                    character.set(j, alfaAlt.get(x));
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character ch: character){
            sb.append(ch);
        }
        String cryptografada = sb.toString();

        System.out.printf("A frase original é: %s\n", original);
        System.out.printf("A frase cryptografada é: %s\n", cryptografada);

    }
}
