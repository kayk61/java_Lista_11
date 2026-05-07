package java_Lista_11;

import java.util.Arrays;

public class at1 {
    public static void main(String[] args) {
        int[] vect = {1,2,3,4,5,6,7,8,9,10};
        int soma;
        soma = 0;


        for (int i : vect) {
            soma +=vect[i-1];
            System.out.println(soma);
        }


    }
}
