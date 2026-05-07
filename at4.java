package java_Lista_11;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] notas = new double[8];
        System.out.println("digite 8 notas");

        for (double i : notas) {
            i = sc.nextDouble();

            if (i<5) {

                System.out.println("Alerta, nota abaixo da media: " + i);

            }
        }
        sc.close();

    }
}
