import Figuri.Cerc;
import Figuri.Dreptunghi;
import Figuri.Figura;
import Figuri.Triunghi;

import java.util.ArrayList;
import java.util.List;

public class ProblemaCurs {
    /*
    1. Creați următoarele clase:
        - o clasă de bază abstractă numită Figura care conține:
        - declarațiile a două metode abstracte pentru calcularea perimetrului și ariei unei figuri
        - un câmp care stochează informațiile dacă este sau nu umplut cu o culoare
        - două clase concrete Cerc(raza) - aria pi*r^2 - 2*pi*r perimetru   și Dreptunghi(lungime si latime) - aria l*L - perimetru 2*(l+L) derivate din figură
        - metoda toString la fiecare clasa in parte si aria + perimetru
        Rezolvați următoarele cerințe:
        a) Creați un tablou de obiecte de tip Figura și afișați tabloul
        b) Definiți o metodă care întoarce suma ariilor dreptunghiurilor din tablou
        c) Adăugați o clasă Trapez care moștenește clasa Figura și adăugați la tablou obiecte de tip trapez.
        d) Definiți o metodă care elimină obiectele de tip Cerc din tablou
     */

    public static void main(String[] args) {
        List<Figura> figuri = new ArrayList<>();
        figuri.add(new Cerc(3,true));
        figuri.add(new Cerc(2, false));
        figuri.add(new Dreptunghi(3,5,true));
        figuri.add(new Dreptunghi(2,3,true));
        //figuri.add(new Triunghi(2,3,3,true));
        //figuri.add(new Triunghi(3,4,5 ,true));
        //figuri.add(new Triunghi(1,2,3 ,true));

        for(var fig : figuri){
            if(fig instanceof Triunghi) {
                if(((Triunghi) fig).TIP_Triunghi == Triunghi.TIP.ISOSCEL)
                    System.out.println(fig);
            }

        }


    }



}
