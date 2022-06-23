package ListeInlantuite;

public class ListaCirculara<T> {
    public Nod<T> Head;

    public void afisare(){
        var aux = Head;
        while(aux.next != Head){
            System.out.println(aux.value);
            aux=aux.next;
        }
    }
}
