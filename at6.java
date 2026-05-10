package Java_lista_11;

import java.util.Arrays;
import java.util.Random;

public class at6 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int maior,menor;
        Random random = new Random();

        for (int i = 0; i<vetor.length; i++) {
            vetor[i] = random.nextInt(10)+1;
        }
        maior = vetor[0];
        menor = vetor[0];

        for (int num:vetor) {
            if (num>maior) {
                maior = num;
            }
            if (num<menor) {
                menor = num;
            }

        }
        System.out.println("O maior numero sorteado foi: "+ maior +" e o menor numero sorteado foi: "+ menor);

    }
}
