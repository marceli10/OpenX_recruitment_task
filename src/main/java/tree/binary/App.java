package tree.binary;

import tree.binary.data.structure.BinaryTree;
import tree.binary.data.structure.IBinaryTree;
import tree.binary.data.structure.INode;
import tree.binary.data.structure.Node;

public class App {
    public static void main(String[] args) {
        INode node1 = new Node(20);
        INode node2 = new Node(30);
        INode node3 = new Node(40);
        INode node4 = new Node(50);
        INode node5 = new Node(60);

        IBinaryTree tree = new BinaryTree(node1);
        tree.addRightNode(node1, node2);
        tree.addRightNode(node2, node3);
        tree.addLeftNode(node2, node4);
        tree.addLeftNode(node3, node5);

        System.out.printf("[*] Leafs count: %d\n", tree.leafsCount());
        System.out.printf("[*] Largest number of edges: %d\n", tree.largestNumberOfEdges());

        INode nodeA = new Node(65);
        INode nodeB = new Node(66);
        INode nodeC = new Node(67);
        INode nodeD = new Node(68);
        INode nodeE = new Node(69);
        IBinaryTree tree2 = new BinaryTree(nodeA);

        tree2.addRightNode(nodeA, nodeB);
        tree2.addLeftNode(nodeA, nodeD);
        tree2.addLeftNode(nodeD, nodeC);
        tree2.addLeftNode(nodeC, nodeE);

        System.out.printf("[*] tree == tree2: %b\n", tree.equals(tree2));

    }
}
