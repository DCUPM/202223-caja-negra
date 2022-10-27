import com.binarytree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeTesting {
    BinaryTree bt;

    @BeforeEach
    public void init() {
        bt = new BinaryTree(0);
        bt.insert(1, bt.getRoot(), true);
        bt.insert(2, bt.getRoot(), false);
        bt.insert(3, bt.search(1), true);
        bt.insert(4, bt.search(1), false);
        bt.insert(5, bt.search(2), true);
        bt.insert(6, bt.search(2), false);

        System.out.println("*** innit ***");
    }

    @Test
    @DisplayName("Probando metodo depth()")
    public void depthTesting() {
        assertEquals(3, bt.depth());
        System.out.println("*** prueba depth() ***");
        assertEquals(2, bt.depth(bt.search(1)));
        System.out.println("*** prueba depth(Node<T> node) ***");
    }

    @Test
    @DisplayName("Probando equals()")
    public void equalsTesting() {
        assertTrue(bt.equals(bt));
        System.out.println("*** prueba equals(BinaryTree<T> tree) ***");
    }


}
