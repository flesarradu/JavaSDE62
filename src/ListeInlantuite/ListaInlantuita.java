package ListeInlantuite;

import java.util.Iterator;

public class ListaInlantuita<T> {

    public Nod<T> Head;

    public ListaInlantuita() {
        Head = null;
    }

    public void clear(){
        Head = null;
    }

    public void add(T el){
        if(Head == null){
            Head = new Nod<>(el);
        }
        else {
            last().next = new Nod<>(el);
        }
    }
    public void add(T el, Nod<T> nod){
        if(Head == null){
            return;
        }
        else {
            var aux = Head;
            while(aux.value != nod.value){
                aux = aux.next;
            }
            var aux2 = aux.next;
            aux.next = new Nod<>(el);
            aux.next.next = aux2;
        }
    }

    public void remove(T el){
        if(el == Head.value)
            Head = Head.next;
        else {
            var aux = Head;
            while(aux.next.value != el){
                aux=aux.next;
            }
            aux.next = aux.next.next;
        }
    }

    public void print(){
        var aux = Head;
        while(aux != null){
            System.out.println(aux.value);
            aux = aux.next;
        }
    }

    private Nod<T> last(){
        var aux = Head;
        while(aux.next != null){
            aux = aux.next;
        }
        return aux;
    }

}

