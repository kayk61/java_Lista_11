package java_Lista_11;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int contP;
        contP = 0;

        for (int i :  num ) {
            if (num[i-1]%2 == 0) {
                contP++;
            }

        }
        System.out.println("A quantidade de numeros pares digitada foi: "+ contP);
        sc.close();

    }
}
