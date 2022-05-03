package tree.binary.data.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinaryTree implements IBinaryTree{

    private final List<INode> tree;
    private final INode root;

    public BinaryTree(INode root) {
        tree = new ArrayList<>();
        this.root = root;
    }

    @Override
    public void addLeftNode(INode parent, INode child) {
        if (parent.getLeftChild() == null) {
            parent.setLeftChild(child);
            child.setParent(parent);
            tree.add(child);
            return;
        }
        throw new UnsupportedOperationException("This node already has left child");
    }

    @Override
    public void addRightNode(INode parent, INode child) {
        if (parent.getRightChild() == null) {
            parent.setRightChild(child);
            child.setParent(parent);
            tree.add(child);
            return;
        }
        throw new UnsupportedOperationException("This node already has right child");
    }

    @Override
    public long leafsCount() {
        return tree.stream().filter(el -> el.getRightChild() == null && el.getLeftChild() == null).count();
    }

    @Override
    public int largestNumberOfEdges() {
        List<INode> leafs = tree.stream().filter(el -> el.getRightChild() == null && el.getLeftChild() == null).toList();

        int largestNum = -1;

        for(var node: leafs) {
            int edges = 0;

            while(node.getParent() != null) {
                edges++;
                node = node.getParent();
            }
            if(edges > largestNum)
                largestNum = edges;
        }

        return largestNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryTree that = (BinaryTree) o;

        if(!Objects.equals(this.root, that.root)) return false;

        for(int i = 0; i < tree.size(); i++) {
            if(! that.tree.get(i).equals(this.tree.get(i)))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = tree.hashCode();
        result = 31 * result + (root != null ? root.hashCode() : 0);
        return result;
    }
}
