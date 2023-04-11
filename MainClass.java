import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // ArrayList<Carta> baralho = new ArrayList<Carta>();

        Carro car = new Carro("Ferrari", "Asolan", 32);
        Moto moto = new Moto("Harley", "Cacau show");

        moto.imprimir();
        car.imprimir();
    }

}
