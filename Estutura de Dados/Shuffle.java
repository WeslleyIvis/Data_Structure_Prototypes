import java.util.ArrayList;

// Shuffle = Embaralhar

public class Shuffle {
    // Embaralha vetor statico
    public void shuffle(int[] array) {
        int temp, sorteio;
        for (int i = 0; i < array.length; i++) {
            sorteio = (int) (Math.random() * array.length);
            temp = array[sorteio];
            array[sorteio] = array[i];
            array[i] = temp;
        }
    }

    // Embaralha vetor dinamico
    public ArrayList<Integer> shuffleDinamicArray(ArrayList<Integer> array) {
        ArrayList<Integer> clone = new ArrayList<Integer>();
        int position;

        while (array.size() > 0) {
            position = (int) (Math.random() * array.size());
            clone.add(array.remove(position));
        }

        System.out.println(array);
        return array;
    }

    public void write(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
