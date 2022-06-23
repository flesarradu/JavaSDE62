package Figuri;

public class Trapez extends Figura {

    public int baza_mare;
    public int baza_mica;
    public int inaltime;

    public Trapez(int v1, int v2, int inaltime, boolean colorat) {
        super(colorat);

        if (v1 > v2) {
            baza_mare = v1;
            baza_mica = v2;
        }
        else {
            baza_mare = v2;
            baza_mica = v1;
        }

        this.inaltime = inaltime;
    }

    @Override
    public double calcul_perimetru() {
        return 0;
    }

    @Override
    public double calcul_arie() {
        return 1.0 * (baza_mare + baza_mica) * inaltime / 2;
    }
}
