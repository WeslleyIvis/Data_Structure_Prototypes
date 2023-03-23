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
}
