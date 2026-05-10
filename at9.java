package Java_lista_11;

import java.util.Random;

public class at9 {
    public static void main(String[] args) {
        char[] letras = new char[20];
        int cont;
        cont = 0;
        Random random = new Random();

        for (int i=0;i< letras.length;i++) {
            letras[i] = (char) (random.nextInt(26) + 'a');

        }
        for (int j : letras) {
            if (j == 'a'||j == 'e'||j == 'i'||j == 'o'||j == 'u'){
                cont++;
            }
        }
        System.out.println("A quantidade de vogais sorteadas no vetor foi de: "+ cont);

    }
}
