package Obiecte;

public class Sarpe extends Animal implements Reptila, SangeRece {

    public Sarpe(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void inmultire() {
        System.out.println("Inmultire prin oua");
    }

    @Override
    public void respira() {
        System.out.println("Ssssss");
    }

    @Override
    public void somn() {
        System.out.println("Szzszzszszs");
    }

    @Override
    public String toString() {
        return "Sarpe{" +
                "Nume='" + Nume + '\'' +
                ", Rasa='" + Rasa + '\'' +
                '}';

    }
}
