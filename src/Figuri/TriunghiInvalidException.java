package Figuri;


/**
 * Este aruncata cand suma a doua laturi oarecare ale triunghiului este mai mica decat cea de a 3a latura
 */
public class TriunghiInvalidException extends Exception{
    private double latura;

    public TriunghiInvalidException(String message, int latura){
        super(message);
        this.latura = latura;
    }

    public double getLaturaIncorecta(){
        return latura;
    }
}
