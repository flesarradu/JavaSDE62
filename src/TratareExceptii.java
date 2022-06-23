import Figuri.LaturaInvalidaException;
import Figuri.Trapez;
import Figuri.Triunghi;
import Figuri.TriunghiInvalidException;


public class TratareExceptii {
    public static void main(String[] args){



        int t = 12345, i=0;
        for(;t!=0; i++,System.out.println(t%10),t/=10);
        System.out.println("Nr cifre: "+ i );

        try {
            Triunghi xx = new Triunghi(-1, 1, -2, false);
        } catch(LaturaInvalidaException ex){
            ex.printStackTrace();
            System.out.println("Latura incorecta este : " + ex.getLaturaIncorecta());
        } catch (TriunghiInvalidException ex){
            ex.printStackTrace();
            System.out.println("Latura incorecta este : " + ex.getLaturaIncorecta());
        }
    }
}
