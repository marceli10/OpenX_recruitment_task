package tree.binary.data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NodeTest {

    @Test
    void testEquals1() {
        INode node1 = new Node(5);
        INode node2 = new Node(5);

        assertEquals(node1, node2);
    }

    @Test
    void testEquals2() {
        INode node1 = new Node(5);
        INode node2 = new Node(15);

        assertNotEquals(node1, node2);
    }

    @Test
    void testEquals3() {
        Node nodeA1 = new Node(1);
        Node nodeA2 = new Node(2);
        Node nodeA3 = new Node(3);


        Node nodeB1 = new Node(1);
        Node nodeB2 = new Node(2);
        Node nodeB3 = new Node(3);


        nodeA1.setRightChild(nodeA2);
        nodeA1.setLeftChild(nodeA3);


        nodeB1.setRightChild(nodeB2);
        nodeB1.setLeftChild(nodeB3);

        assertEquals(nodeA1, nodeB1);
    }


    @Test
    void testEquals4() {

        INode nodeA1 = new Node(21);
        INode nodeA2 = new Node(37);

        INode nodeB1 = new Node(21);
        INode nodeB2 = new Node(37);

        nodeA1.setRightChild(nodeA2);

        nodeB1.setLeftChild(nodeB2);


        assertNotEquals(nodeA1, nodeB1);
    }


    @Test
    void testEquals5() {
        INode[] nodesA = new Node[] {new Node(13), new Node(37)};
        INode nodeB = new Node(37);

        nodesA[0].setRightChild(nodesA[1]);

        assertNotEquals(nodesA[1], nodeB);
    }

}