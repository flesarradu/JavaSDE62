package Obiecte;

public class Caine extends Animal implements SangeRece, Comparable<Caine>{

    public Caine(String nume, String rasa) {
        super(nume, rasa);
    }

    @Override
    public void inmultire() {
        System.out.println("Naste pui vii");
    }

    @Override
    public void respira() {
        System.out.println("Ham hammm");
    }

    @Override
    public int compareTo(Caine o) {
        if(Nume == "Azor")
            return 1;
        else if(o.Nume == "Azor")
            return -1;
        else
            return Nume.compareTo(o.Nume);
    }
}
