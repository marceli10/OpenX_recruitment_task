# Task 1 solution

This solution has unit tests that show the validity of the functions I have implemented.

## Summary of classes
### Interfaces:

- IBinaryTree
    - `void addLeftNode(INode parent, INode child)`:
      This method adds the left child to the parent, if the parent already has a child on this side,
      method throws the UnsupportedOperationException.
    - `void addRightNode(INode parent, INode child)`:
      This method adds the right child to the parent, if the parent already has a child on this side,
      method throws the UnsupportedOperationException.
    - `long leafsCount()`: This method counts the leaves in the tree.
    - `int largestNumberOfEdges()`: This method returns the highest number of branches in the tree.

- INode
  - `INode getLeftChild()`: this method returns left child of the node.

  - `INode getRightChild()`: this method returns right child of the node.

  - `INode getParent()`: this method returns parent node.

  - `int getValue()`: this method returns value of the node.

  - `void setLeftChild(INode leftChild)`: This method allows you to set the left child of the node.

  - `void setRightChild(INode rightChild)`: This method allows you to set the right child of the node.

  - `void setParent(INode parent)`: This method allows you to set the parent of the node.

### Classes:
- BinaryTree: This class implements IBinaryTree interface and has two fields, one of them is a root node and second is a list of nodes in tree. 
    This class also has own implementation of `equals(Object o)` and `hashCode()` functions.
- Node: This class implements INode interface and has 4 fields: value field and references to left, right child and parent node.
  This class also has own implementation of `equals(Object o)` and `hashCode()` functions.