import Obiecte.Persoana;
import Obiecte.Student;

import java.util.*;


//Creati o lista cu 10 elemente random - bifa
//Afisati minimul, maximul, suma elementelor si media geometrica a minim si maxim
/*

    1. Calculati intr-o variabila suma a doua numere primite pe linia de argumente
    2. Calculati intr-o variabila suma a doua numere random - afisati si numerele inainte
    3. Creati o lista cu 12 elemenete random si afisati lista
        3.1 Afisati minimul din lista
        3.2 Afisati maximul din lista
        3.3 Afisati media aritmetica a elementelor din lista
        3.4 Afisati cate valori pare sunt in lista
        3.5 Afisati valorile peste media aritmetica a listei
    4. Creati o clasa cu cel putin 3 atribute de tip diferit
        4.1 Constructori (alt + insert)
        4.2 Metoda de afisare (toString)

*/
public class Main {
    public static void main(String[] args) {

        fibo(26);
        System.out.println();
        System.out.println(fiboRec(5));
        System.out.println(cmmdc(55,17));
        System.out.println(cmmdc(26,4));
        System.out.println(cmmdc2(55,17));
        System.out.println(cmmdc2(26,4));

        //Afisati media varstei persoanelor din lista
        List<Persoana>  persoane = new ArrayList<>();
        persoane.add(new Student("florin", "ionel", 29, 9.3));
        persoane.add(new Persoana("Flesar", "Radu", 31));
        persoane.add(new Student("Florinel", "Ionel", 30, 10,"Stiinte economice"));



        int sumaVarste = 0;
        for(var p : persoane){
            sumaVarste+= p.getVarsta();
        }


        int sumaVarstePeroane = 0, nrPersoane = 0;
        for(var p : persoane){
            if(!(p instanceof Student)){
                sumaVarstePeroane += p.getVarsta();
                nrPersoane++;
            }
        }

        double media = 1.0*sumaVarste/persoane.size();
        double mediaPersoane = 1.0* sumaVarstePeroane / nrPersoane;



        double sumaNote = 0, nrStudenti = 0;
        for(var p : persoane){
            if(p instanceof Student){
                sumaNote += ((Student) p).Media;
                nrStudenti++;
            }
        }
        double mediaStudenti = sumaNote / nrStudenti;

        System.out.println("Media varstei este: " + media);
        System.out.println("Media varstei persoane este: " + mediaPersoane);
        System.out.println("Media notelor este: " + mediaStudenti);

        Clasa.main(args);

    }

    //Algoritmul lui euclid
    public static int cmmdc(int a, int b){
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    //Scaderi repetate
    public static int cmmdc2(int a, int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }

    public static void fibo(int n){
        int f1=1, f2=1;
        System.out.print(f1+" "+f2+" ");
        for(int i=0; i < n-2; i++){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3+" ");
        }
    }

    public static int fiboRec(int n){
         if(n==0 || n==1)
             return 1;
         return fiboRec(n-1)+fiboRec(n-2);
    }




    public static void printf(String format, Object... args){
        System.out.printf(format, args);
    }
    public static void print(String text){
        System.out.println(text);
    }
    //x - BOUND

    /**
     * Metoda returneaza o valoare aleatorie de tip int in intervalul 0 - bound
     * @param bound Limita superioara a intervalului
     */
    static void nextInt(int bound){

    }
    /**
     * Metoda returneaza o valoare aleatorie de tip int in intervalul [origin - bound]
     * @param origin Limita inferioara a intervalului
     * @param bound Limita superioara a intervalului
     */
    static void nextInt(int origin, int bound){

    }
}
