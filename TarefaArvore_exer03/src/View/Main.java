package View;

import Controller.Arvore3;

public class Main {
    public static void main(String[] args) {
        Arvore3 p= new Arvore3();
        char[] vetor= {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};

        p.geraArvore(vetor);


    }

}
