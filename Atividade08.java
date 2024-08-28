package Atividade12;
import java.util.ArrayList;
import java.util.Arrays;


public class Atividade08 {
    public static void main(String[] args) {
        // Criando um array de inteiros com 5 elementos
        int[] array = {10, 20, 30, 40, 50};

        // Convertendo o array para uma ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Adicionando dois novos elementos à ArrayList
        arrayList.add(60);
        arrayList.add(70);

        // Convertendo a ArrayList de volta para um array
        Integer[] arrayFinal = arrayList.toArray(new Integer[0]);

        // Imprimindo o array final
        System.out.println("Array final:");
        for (int num : arrayFinal) {
            System.out.print(num + " ");
        }
    }
}
