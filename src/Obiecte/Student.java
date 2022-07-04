package Obiecte;

 //Creati o clasa cu cel putin 3 atribute de tip diferit
public class Student extends Persoana {


     String Profil;
    public double Media;

    //Constructori (alt + insert)
    public Student(){
        Varsta = 0;
        Media = 0;
    }

    public Student(String nume, String prenume, int varsta, double media, String profil)  {
        super(nume,prenume,varsta);
        Profil = profil;
        Media = media;
    }

    public Student(String nume, String prenume, int varsta, double media) {
        super(nume,prenume,varsta);
        Media = media;
        Profil = "n-avem";
    }

     public String getProfil() {
         return Profil;
     }

    @Override
    public String toString(){
        if(Profil != "n-avem")
            return "Studentul " + Nume + " de la profilul " + Profil + " cu media " + Media;
        return "Studentul " + Nume  + " cu media " + Media;
    }

 }
