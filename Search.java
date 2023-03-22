public class Search {
    public int linearSearch(int[] vet, int value) {
        for (int x = 0; x < vet.length; x++) {
            if (vet[x] == value) {
                return x;
            }
        }
        return -1;
    }

    public boolean bynariSearch(int[] vet, int value) {
        int start = 0;
        int middle = 0;
        int max = vet.length - 1;

        while (start <= max) {
            middle = (start + max) / 2;

            if (vet[middle] == value)
                return true;
            else if (vet[middle] > value) {
                max = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return false;
    }
}