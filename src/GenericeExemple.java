import Obiecte.Caine;

import java.util.*;

public class GenericeExemple {
    public static void main(String[] args) {

        Map<String,String> dictionar = new HashMap<>();

        dictionar.put("abstract", "Ceva care nu apartine domeniului real, o idee");

        //System.out.println(dictionar.get("abstract"));

        System.out.println(maxim(5.3,2.4));
        System.out.println(maxim(new Caine("Azor", "Lup"),new Caine("Bujor", "Lup")));


        List<Integer> list = new ArrayList<>();
        Random r = new Random(System.currentTimeMillis());

        for(int i=0;i<15;i++){
            list.add(r.nextInt(10));
        }

        Map<Integer,Integer> frecventa = new HashMap<>();

        for(Integer n : list){
            if(!frecventa.containsKey(n)){
                frecventa.put(n,1);
            }
            else{
                frecventa.put(n, frecventa.get(n) + 1);
            }
        }

        for(var x : frecventa.keySet()){
            System.out.printf("Cifra:Frecventa  %d : %d\n", x, frecventa.get(x));
        }



    }


    public static <T extends Comparable<T>> T maxim(T a, T b){
        return a.compareTo(b) > 0 ? a : b;
    }

    public static int sumaPanaLaN(int n){
        return (n*(n+1))/2;
    }

    public static int sumaLaPatrat(int a, int b){
         return a*a + 2*a*b + b*b;
    }
}
