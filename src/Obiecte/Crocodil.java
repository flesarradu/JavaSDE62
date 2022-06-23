package Obiecte;

public class Crocodil extends Animal implements Reptila {

    public Crocodil(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void inmultire() {
        System.out.println("Imnultire prin oua");
    }

    @Override
    public void respira() {
        System.out.println("Nu stiu");
    }

    @Override
    public String toString() {
        return "Crocodil{" +
                "Nume='" + Nume + '\'' +
                ", Rasa='" + Rasa + '\'' +
                '}';
    }
}
