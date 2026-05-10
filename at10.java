package Java_lista_11;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numeros = new int[]{1,1,2,2,2,3,4,4,5,5,5,5,5,6,6,7,7,7,8,9,10,10};
        int ndigitado,cont;
        cont = 0;


        System.out.println("Digite um numero de 1 a 10 e sera exibido quantas vezes o numero apareçe no vetor");
        ndigitado = sc.nextInt();
        if (ndigitado>10) {
            while (ndigitado > 10) {
                System.out.println("numero invalido");
                ndigitado = sc.nextInt();

            }
        }
        for (int i : numeros) {
            if (i == numeros[i]) {
                cont++;
            }
        }
        System.out.println("o numero digitado apareçe "+ cont+" vezes no vetor");
        sc.close();
    }
}
