package tree.binary.data.structure;

import java.util.Objects;

public class Node implements INode {
    private final int value;
    private INode leftChild;
    private INode rightChild;
    private INode parent;

    public Node(int value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
        parent = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public INode getLeftChild() {
        return leftChild;
    }

    @Override
    public void setLeftChild(INode leftChild) {
        this.leftChild = leftChild;
        this.leftChild.setParent(this);
    }

    @Override
    public INode getRightChild() {
        return rightChild;
    }

    @Override
    public void setRightChild(INode rightChild) {
        this.rightChild = rightChild;
        this.rightChild.setParent(this);
    }

    @Override
    public INode getParent() {
        return parent;
    }

    @Override
    public void setParent(INode parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (value != node.value) return false;
        if (this.parent == null && node.parent == null) {
            if (!Objects.equals(this.leftChild, node.leftChild)) return false;
            return Objects.equals(this.rightChild, node.rightChild);
        }
        try {
            assert this.parent != null;
            return this.parent.getValue() == node.parent.getValue();
        } catch (NullPointerException ex) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (leftChild != null ? leftChild.hashCode() : 0);
        result = 31 * result + (rightChild != null ? rightChild.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }
}
