import ListeInlantuite.ListaInlantuita;
import ListeInlantuite.Nod;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class ListaInlantuitaExample {
    public static void main(String[] args) {
        ListaInlantuita<Integer> lista = new ListaInlantuita<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.remove(4);
        lista.add(5,new Nod<>(2));
        lista.print();

    }
}
