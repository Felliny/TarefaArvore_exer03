package Controller;

import model.matheus.libArvoreChar.Arvore;

public class Arvore3 {


    public Arvore3() {
        super();
    }

    public void geraArvore(char[] vetor){
        Arvore arvore= new Arvore();

        int tamanho= vetor.length;

        for (int i = 0; i < tamanho; i++) {
            arvore.insert(vetor[i]);
        }


        try {
            arvore.remove('F');
            arvore.remove('U');
            System.out.println("Prefix: ");
            arvore.prefixSearch();
            System.out.println("\n");
            System.out.println("Infix: ");
            arvore.infixSearch();
            System.out.println("\n");
            System.out.println("Posfix: ");
            arvore.postfixSearch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
