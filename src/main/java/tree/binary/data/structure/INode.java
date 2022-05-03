package tree.binary.data.structure;

public interface INode {
    INode getLeftChild();

    INode getRightChild();

    INode getParent();

    int getValue();

    void setLeftChild(INode leftChild);

    void setRightChild(INode rightChild);

    void setParent(INode parent);
}
