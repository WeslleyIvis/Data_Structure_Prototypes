public class Carroex {
    private int x, y;
    Motor motor;

    public Carroex(int x, int y) {
        motor = new Motor(100);
        this.x = x;
        this.y = y;
    }

    public void acelerar() {
        motor.Ligar();
    }

    public void brecar() {
        motor.Desligar();
    }

    public String toString() {
        return "x: " + x + "\ny: " + y + "\nMotor" + motor.toString();
    }
}
