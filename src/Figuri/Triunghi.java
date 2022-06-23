package Figuri;

public class Triunghi extends Figura {

    public int a;
    public int b;
    public int c;

    public TIP TIP_Triunghi;

    public enum TIP {
        DREPTUNGHIC,
        ISOSCEL,
        ECHILATERAL,
        OARECARE
    }

    public Triunghi(int a, int b, int c, boolean colorat) throws LaturaInvalidaException, TriunghiInvalidException {
        super(colorat);

        if(a<0){
            throw new LaturaInvalidaException("Una sau mai multe laturi nu este pozitiva",a);
        }
        if(b<0){
            throw new LaturaInvalidaException("Una sau mai multe laturi nu este pozitiva",b);
        }
        if(c<0){
            throw new LaturaInvalidaException("Una sau mai multe laturi nu este pozitiva",c);
        }

        if(a+b<c){
            throw new TriunghiInvalidException("Latura C este prea mare", c);
        }

        this.a = a;
        this.b = b;
        this.c = c;

        if(a==b && b==c){
            TIP_Triunghi = TIP.ECHILATERAL;
        }
        else if (a==b || b == c || a==c) {
            TIP_Triunghi = TIP.ISOSCEL;
        }
        else if(c*c == a*a + b*b){
            TIP_Triunghi = TIP.DREPTUNGHIC;
        }
        else
            TIP_Triunghi = TIP.OARECARE;
    }

    @Override
    public String toString() {
        return "Triunghi{" +
                "colorat=" + colorat +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", TIP_Triunghi=" + TIP_Triunghi +
                '}';
    }

    @Override
    public double calcul_perimetru() {
        return a+b+c;
    }

    @Override
    public double calcul_arie() {
        return 0;
    }
}
