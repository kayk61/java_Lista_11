package Java_lista_11;

import java.util.Arrays;
import java.util.Random;

public class at7 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int soma,media,contM;
        media = 0;
        soma=0;
        contM = 0;
        Random random = new Random();

        for (int i = 0; i<vetor.length; i++) {
            vetor[i] = random.nextInt(10)+1;
        }

        for (int num:vetor) {
           soma +=num;
        }
        media = soma/10;
        for (int n : vetor) {
            if (n > media) {
                contM++;
            }

        }
        System.out.println("A media dos numeros é: "+ media + " e a quantidade de valores acima da media no vetor é de: "+ contM);
        System.out.println(Arrays.toString(vetor));
    }
}
