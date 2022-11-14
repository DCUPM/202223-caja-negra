import com.binarytree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.text.html.HTMLDocument;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeTesting {
    BinaryTree bt;

    @BeforeEach
    public void init() {
        bt = new BinaryTree("0");
        bt.insert("1", bt.getRoot(), true);
        bt.insert("2", bt.getRoot(), false);
        bt.insert("3", bt.search("1"), true);
        bt.insert("4", bt.search("1"), false);
        bt.insert("5", bt.search("2"), true);
        bt.insert("6", bt.search("2"), false);

        System.out.println("*** innit ***");
        System.out.print(bt.toString());
    }

    @Test
    @DisplayName("Probando metodo depth()")
    public void depthTesting() {
        assertEquals(2, bt.depth());
        System.out.println("*** prueba depth() ***");
        assertEquals(1, bt.depth(bt.search("1")));
        System.out.println("*** prueba depth(Node<T> node) ***");
    }

    @Test
    @DisplayName("Probando equals()")
    public void equalsTesting() {
        assertTrue(bt.equals(bt));
        System.out.println("*** prueba equals(BinaryTree<T> tree) ***");
    }

    @Test
    @DisplayName("Probando remove(Node<T> node)")
    public void removeTesting() {
        bt.remove(bt.search("6"));
        assertEquals(6, bt.size());
        System.out.println("Despues de remove 6...");
        System.out.print(bt.toString());
        System.out.println("Probando remove(Node<T> node)");
        assertThrows(Exception.class, () -> {bt.remove(bt.search("0"));});
        System.out.println("Despues de remover 0...");
        System.out.print(bt.toString());
    }

    @Test
    @DisplayName("Probando iterator()")
    public void iteratorTesting() {
        Iterator it = bt.iterator();
        System.out.println("*** Probando iterator() ***");
        while (it.hasNext())
            System.out.print(it.next().toString()+" ");
    }
}
