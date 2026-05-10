package Java_lista_11;

public class at5 {
    public static void main(String[] args) {
        int[] vetor = new int[] {1,2,3,4,5,6,7,8,9,10};
        int cont;
        cont = 0;

        System.out.println("--Tabuada--");

        for (int i : vetor) {
            cont++;
            System.out.println("5x"+ cont +"=" +vetor[i-1]*5);
        }
    }

}
