
import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
        int[] vet = new int[5];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
        }

        Shuffle em = new Shuffle();
        Sort or = new Sort();

        em.shuffle(vet);

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

    }

}