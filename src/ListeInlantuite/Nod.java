package ListeInlantuite;


public class Nod<T> {
    public T value;
    public Nod<T> next;

    public Nod() {
        next = null;
    }
    public Nod(T el) {
        value = el;
        next = null;
    }
}
