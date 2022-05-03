package tree.binary.data.structure;

public interface IBinaryTree {
    void addLeftNode(INode parent, INode child);
    void addRightNode(INode parent, INode child);
    long leafsCount();
    int largestNumberOfEdges();
}
