package Fisiere;

import Obiecte.Persoana;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FisiereExercitii {
    public static void main(String[] args) {

        File fisier = new File("D:\\Proiecte IntelliJ\\FirstJavaProject_62\\src\\Fisiere\\input.ftxt");
        List<Persoana> pers = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(fisier);
            while(scanner.hasNextDouble()) {
                String linie = scanner.nextLine();
                var date = linie.split(" ");
                pers.add(new Persoana(date[0], date[1], Integer.parseInt(date[2])));
            }
            FileWriter writer = new FileWriter("D:\\Proiecte IntelliJ\\FirstJavaProject_62\\src\\Fisiere\\output.txt");


            for(var p : pers){
                writer.write(p.toString() + "\n");
            }

            pers.forEach((persoana -> {
                try {
                    writer.write(persoana.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));


/*
            pers.forEach(z -> {
                try {
                    // writer.close(); - if you want to intentionally screw up the lambda function.
                    writer.write(z.toString() + "\n");
                } catch (IOException e) {
                    System.out.println("<temporarily closed>");
                    throw new RuntimeException(e);
                }
            });

 */

            /*for (var z : pers) {
                writer.write(((Persoana)z).toString() + "\n");
            }*/

            scanner.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
        EXERCITIUL 1)
            Cititi din fisierul input.txt toate valorile de tip double si afisati media lor.


        Exercitiul 2)
            In fisierul input.txt se gaseste cate un numar de tip double pe fiecare linie.
            Cititi fisierul linie cu linie, separati partea reala si partea imaginara a numarului, afisati-le si
            rescrieti numarul in fisierul output.txt pe o linie noua inlocuind punctul cu virgula.

     */
}
