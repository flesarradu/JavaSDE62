package Figuri;

public class Dreptunghi extends Figura {

    public int lungime;
    public int latime;

    public Dreptunghi(int lungime, int latime, boolean colorat) {
        super(colorat);
        this.lungime = lungime;
        this.latime = latime;
    }

    public double calcul_perimetru() {
        return 2 * (lungime + latime);
    }

    public double calcul_arie() {
        return lungime * latime;
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                ", perimetru=" + calcul_perimetru() +
                ", aria=" + calcul_arie() +
                '}';
    }
}