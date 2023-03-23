
import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
        int[] vet = new int[5];
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
            numeros.add(i);
        }

        Shuffle sh = new Shuffle();
        Sort sr = new Sort();

        sh.shuffle(vet);

        sh.write(vet);
        System.out.println("-__----\n ----- \n ----_-");

        sr.bubbleSort(vet);
        sh.write(vet);

    }

}