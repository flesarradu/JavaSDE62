package Figuri;

public class Cerc extends Figura {

    public int raza;
    final double PI = 3.1415926;

    public Cerc(int raza, boolean colorat) {
        super(colorat);
        this.raza = raza;
    }

    public double calcul_perimetru() {
        return 2 * PI * raza;
    }

    public double calcul_arie() {
        return PI * (raza * raza);
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                ", perimetru=" + calcul_perimetru() +
                ", aria=" + calcul_arie() +
                '}';
    }
}