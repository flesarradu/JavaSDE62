package Obiecte;

public class Persoana {
    public String Nume;
    public String Prenume;
    int Varsta;

    public int getVarsta() {
        return Varsta;
    }

    public void setVarsta(int varsta) {
        if(varsta>0)
            Varsta = varsta;
        else
            System.out.println("Alo?? KF?? Mai mare ca 0 pls!!");
    }

    public Persoana() {
        Nume = "";
        Prenume = "";
        Varsta = 0;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Varsta='" + Varsta + '\'' +
                '}';
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public Persoana(String nume, String prenume, int varsta) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
    }
    public static void blablabla(){
        System.out.println("Bla");
    }
}
