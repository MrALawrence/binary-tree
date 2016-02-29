import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    private Node root = null;

    public Node getRoot() {
        return this.root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addElement(Node node) {

        if (this.root == null) {
            this.setRoot(node);
            return;
        }

        this.addElementRecursive(this.root, node);
    }

    public void addElement(int value) {
        this.addElement(new Node(value));
    }

    public void addElementRecursive(Node parent, Node newEntry) {

        if (newEntry.getValue() > parent.getValue()) {

            if (parent.getRight() == null) {

                parent.setRight(newEntry);
                return;

            } else {

                this.addElementRecursive(parent.getRight(), newEntry);
                return;

            }

        }

        if (parent.getLeft() == null) {

            parent.setLeft(newEntry);
            return;

        }

        this.addElementRecursive(parent.getLeft(), newEntry);
        return;
    }

    public int min(Node parent) {
        if (parent == null) {
            return 0;
        }

        if (parent.getLeft() == null) {
            return parent.getValue();
        }

        return min(parent.getLeft());
    }

    public int min() {
        return this.min(this.root);
    }

    public int max(Node parent) {
        if (parent == null) {
            return 0;
        }

        if (parent.getRight() == null) {
            return parent.getValue();
        }

        return max(parent.getRight());
    }

    public int max() {
        return this.max(this.root);
    }

    public int size(Node parent) {
        if (parent == null) {
            return 0;
        }

        return 1 + this.size(parent.getLeft()) + this.size(parent.getRight());
    }

    public int size() {
        return this.size(this.root);
    }

    public String inOrder(Node parent) {
        if (parent == null) {
            return "";
        }

        String output = "";
        output += this.inOrder(parent.getLeft());
        output += ", ";
        output += parent.getValue();
        output += ", ";
        output += this.inOrder(parent.getRight());

        return output.replaceAll("^, ", "").replaceAll(", $", "");
    }

    public String inOrder() {
        return this.inOrder(this.root);
    }

    public String preOrder(Node parent) {
        if (parent == null) {
            return "";
        }

        String output = "";
        output += parent.getValue();
        output += ", ";
        output += this.preOrder(parent.getLeft());
        output += ", ";
        output += this.preOrder(parent.getRight());

        return output.replaceAll(", , ", ", ").replaceAll(", $", "");
    }

    public String preOrder() {
        return this.preOrder(this.root);
    }

    public String postOrder(Node parent) {
        if (parent == null) {
            return "";
        }

        String output = "";
        output += this.postOrder(parent.getLeft());
        output += ", ";
        output += this.postOrder(parent.getRight());
        output += ", ";
        output += parent.getValue();

        return output.replaceAll(", , ", ", ").replaceAll("^, ", "");
    }

    public String postOrder() {
        return this.postOrder(this.root);
    }

    public String levelOrder(Node parent) {
        if (parent == null) {
            return "";
        }

        Queue<Node> q = new LinkedList<Node>();

        q.add(parent);

        String out = "";

        while (!q.isEmpty()) {

            Node n = q.remove();

            out += n.getValue();
            out += ", ";

            if (n.getLeft() != null) {
                q.add(n.getLeft());
            }

            if (n.getRight() != null) {
                q.add(n.getRight());
            }
        }

        return out.replaceAll(", $", "");

    }

    public String levelOrder() {
        return this.levelOrder(this.root);
    }
}
