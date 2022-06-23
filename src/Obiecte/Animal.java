package Obiecte;

public abstract class Animal implements IAnimal{
    public String Nume;
    public String Rasa;
    public Animal(){
        Nume = "Functioneaza";
    }

    public Animal(String nume, String rasa) {
        Nume = nume;
        Rasa = rasa;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Nume='" + Nume + '\'' +
                ", Rasa='" + Rasa + '\'' +
                '}';

    }
}
