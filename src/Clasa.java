
import Obiecte.*;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clasa {
      public static void main(String[] args){


        List<IAnimal> lista = new ArrayList<>();

        lista.add(new Sarpe("John","Anaconda"));
        lista.add(new Sarpe("Ion","Piton"));
        lista.add(new Caine("Rex", "Ciobanesc"));
        lista.add(new Crocodil("Crocodilu", "Mare"));
        lista.add(new IAnimal() {
            @Override
            public void inmultire() {
                System.out.println("Inmultire prin oua");
            }

            @Override
            public void respira() {
                System.out.println("Cra cra cra cra");
            }

            @Override
            public void somn() {
                System.out.println("Zzzzz cra Zzzzzz cra cra Zzzzz");
            }
        });

        for(var z : lista){
            z.respira();
        }

    }
}
