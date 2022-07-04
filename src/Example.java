import Obiecte.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        /*
            Creați o clasă navă de război care are ca atribute un nume, o locație (coordonate de Locatie(lat,long)
            latitudine și longitudine) și o listă a căpitanilor săi. Fiecare căpitan este caracterizat
            prin nume, prenume, varsta și perioada în care a fost căpitan al acestei nave (data începerii contractului
            – data terminării contractului - String.

            0) Toti membrii privati si accesati cu get/set. !!! La set corectitudinea datelor
            1) Creați o listă de nave și afișați-o
            2) Validați corectitudinea datelor atunci când sunt introduse, de ex. valorile
            pentru latitudine/longitudine, datele contractului, ...
            3) Pentru fiecare căpitan, identificați navele și perioada/perioadele în care a fost
            căpitan pe acele nave
            BONUS: Identificați navele din listă care se află în raza de acțiune a altei nave
         */

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Flesar", "Radu", 20, 9, "informatica"));
        studenti.add(new Student("Loredana", "Ispas", 19, 5.1, "matematica"));
        studenti.add(new Student("Ion", "Radu", 22, 10, "informatica"));
        studenti.add(new Student("Maria", "Coman", 21, 9.2, "matematica"));
        studenti.add(new Student("Olaf", "Jonn", 17, 6, "informatica"));
        studenti.add(new Student("Marius", "Coman", 17, 6.3, "matematica"));
        studenti.add(new Student("Marius", "Oarza", 24, 8.5, "inginerie"));

        /*
        Set<String> profile = new HashSet<>();
        for (var s : studenti) {
            profile.add(s.getProfil());
        }

        for(var p : profile){
            System.out.println(p);
            for (var s : studenti) {
                if(s.getProfil()==p){
                    System.out.println(s);
                }
            }
        }

         */



        Map<String, List<Student>> map = new HashMap<>();

        for(var s : studenti){
            if(map.containsKey(s.getProfil())){
                map.get(s.getProfil()).add(s);
            }
            else {
                List<Student> students = new ArrayList<>();
                students.add(s);
                map.put(s.getProfil(),students);
            }
        }

        for(var key : map.keySet()){
            System.out.println(key);
            for(var s : map.get(key)){
                System.out.println(s);
            }
        }






    }
    public static void fisiere(){
        File fisier = new File("D:\\Proiecte IntelliJ\\FirstJavaProject_62\\src\\Fisiere\\input.txt");
        File fisier2 = new File("D:\\Proiecte IntelliJ\\FirstJavaProject_62\\src\\Fisiere\\output.txt");
        try {
            Scanner scanner = new Scanner(fisier);
            while(scanner.hasNextInt()){
                int x = scanner.nextInt();
                System.out.println(x);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(fisier2);
            fileWriter.write("Scriu in fisier...");
            fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
