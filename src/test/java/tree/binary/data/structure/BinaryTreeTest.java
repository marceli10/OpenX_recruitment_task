package tree.binary.data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BinaryTreeTest {


    private IBinaryTree testTreeConstructor1() {
        // creating nodes
        INode n1 = new Node(5);
        INode n2 = new Node(3);
        INode n3 = new Node(7);
        INode n4 = new Node(2);
        INode n5 = new Node(5);
        INode n6 = new Node(1);
        INode n7 = new Node(0);
        INode n8 = new Node(2);
        INode n9 = new Node(8);
        INode n10= new Node(5);

        // creating tree;
        IBinaryTree tree = new BinaryTree(n1);
        tree.addLeftNode(n1, n2);
        tree.addRightNode(n1, n3);
        tree.addLeftNode(n2, n4);
        tree.addRightNode(n2, n5);

        tree.addLeftNode(n3, n6);
        tree.addRightNode(n3, n7);

        tree.addLeftNode(n7, n8);
        tree.addRightNode(n7, n9);

        tree.addRightNode(n9, n10);

        return tree;
    }

    private IBinaryTree testTreeConstructor2() {
        // creating nodes
        INode n1 = new Node(5);
        INode n2 = new Node(3);
        INode n3 = new Node(7);
        INode n4 = new Node(20);
        INode n5 = new Node(5);
        INode n6 = new Node(30);
        INode n7 = new Node(1);
        INode n8 = new Node(10);
        INode n9 = new Node(21);
        INode n10= new Node(100);

        // creating tree;
        IBinaryTree tree = new BinaryTree(n1);
        tree.addLeftNode(n1, n2);
        tree.addRightNode(n1, n3);
        tree.addLeftNode(n2, n8);
        tree.addRightNode(n2, n6);

        tree.addLeftNode(n3, n5);
        tree.addRightNode(n3, n4);

        tree.addLeftNode(n8, n9);
        tree.addRightNode(n9, n10);

        tree.addRightNode(n10, n7);

        return tree;
    }


    @Test
    void testLeafsCount1() {
        IBinaryTree testTree = testTreeConstructor1();

        assertEquals(5, testTree.leafsCount());
    }

    @Test
    void testLeafsCount2() {
        IBinaryTree testTree = testTreeConstructor2();

        assertEquals(4, testTree.leafsCount());
    }

    @Test
    void testLargestNumberOfEdges1() {
        IBinaryTree testTree = testTreeConstructor1();

        assertEquals(4, testTree.largestNumberOfEdges());
    }

    @Test
    void testLargestNumberOfEdges2() {
        IBinaryTree testTree = testTreeConstructor2();

        assertEquals(5, testTree.largestNumberOfEdges());
    }

    @Test
    void testEquals1() {
        IBinaryTree testTree1 = testTreeConstructor1();
        IBinaryTree testTree2 = testTreeConstructor1();

        assertEquals(testTree1, testTree2);
    }

    @Test
    void testEquals2() {
        IBinaryTree testTree1 = testTreeConstructor1();
        IBinaryTree testTree2 = testTreeConstructor2();

        assertNotEquals(testTree1, testTree2);
    }
}