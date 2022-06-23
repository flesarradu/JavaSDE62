package Obiecte;

public interface IAnimal{
    void inmultire();
    void respira();
    default void somn(){
        System.out.println("Zzzzz");
    }
}
