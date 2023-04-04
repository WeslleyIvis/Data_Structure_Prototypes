public class Sort {
    public void bubbleSort(int[] vet) {
        boolean ok = true;
        int aux;
        while (ok) {
            ok = false;
            for (int i = 0; i < vet.length && i + 1 < vet.length; i++) {
                if (vet[i] > vet[i + 1]) {
                    aux = vet[i + 1];
                    vet[i + 1] = vet[i];
                    vet[i] = aux;
                    ok = true;
                }
            }
        }
    }

    public void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }
    }
}
