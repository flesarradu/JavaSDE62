package Figuri;

public abstract class Figura {
   public boolean colorat;

    public Figura(boolean colorat) {
        this.colorat = colorat;
    }

    public abstract double calcul_perimetru();

    public abstract double calcul_arie();

    @Override
    public String toString() {
        return "Figura{" +
                "colorat=" + colorat +
                '}';
    }
}