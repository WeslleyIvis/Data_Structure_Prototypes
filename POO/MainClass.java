import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        int[] vet = new int[100000];
        int[] vet1 = new int[100000];
        int[] vet2 = new int[100000];

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
            vet1[i] = i;
            vet2[i] = i;
            numeros.add(i);
        }

        Shuffle deck = new Shuffle();
        deck.shuffle(vet);
        deck.shuffle(vet1);
        deck.shuffle(vet2);

        Sort sort = new Sort();

        long startSS = System.currentTimeMillis();
        sort.selectionSort(vet);
        long endSS = System.currentTimeMillis();
        System.out.println("\nTIME: " + (endSS - startSS));

        long startIS = System.currentTimeMillis();
        sort.insertSort(vet1);
        long endIS = System.currentTimeMillis();
        System.out.println("TIME: " + (endIS - startIS));

        long startBS = System.currentTimeMillis();
        sort.bubbleSort(vet2);
        long endBS = System.currentTimeMillis();
        System.out.println("TIME: " + (endBS - startBS));
    }

}