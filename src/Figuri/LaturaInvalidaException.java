package Figuri;

public class LaturaInvalidaException extends Exception{
    private double latura;

    public LaturaInvalidaException(String message, int latura){
        super(message);
        this.latura = latura;
    }

    public double getLaturaIncorecta(){
        return latura;
    }
}
