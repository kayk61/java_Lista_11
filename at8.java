package Java_lista_11;

import java.util.Arrays;

public class at8 {
    public static void main(String[] args) {
        String[] palavras = new String[]{"macaco","paulo","teken8","minecraft","mouse","Stuartlittle","olivia palito","bozo","balao","mostarda"};

        System.out.println("palavras com mais que 5 letras dentro do vetor");

        for (String palavra : palavras) {
            if (palavra.length() > 5) {
                System.out.println(palavra);
            }
        }
        System.out.println("\n");
        System.out.println("todas as palavras dentro do vetor");
        System.out.println(Arrays.toString(palavras));
    }
}
