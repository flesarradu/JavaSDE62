import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratoriExemple {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        Iterator<Integer> it =  list2.iterator();

        while(it.hasNext()){
            var x = it.next();
            System.out.println(x);
        }
        for(var x : list2){
            System.out.println(x);
        }
        for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }


    }
}
