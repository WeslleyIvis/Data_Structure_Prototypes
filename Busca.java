public class Busca {
    public static void main(String[] args) {

        int[] vet = creatVetor(50);

    }

    public static int[] creatVetor(int size) {
        int[] vetor = new int[size];

        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = x;
        }
        return vetor;
    }

}