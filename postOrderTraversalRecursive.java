import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}
class postOrderTraversalRecursive{
    static void recursion(Node root, List<Integer> li){
        if(root == null){
            return;
        }
        recursion(root.left, li);
        recursion(root.right, li);
        li.add(root.data);
    }
    static List<Integer> PostOrderTraversal(Node root){
        List<Integer> li = new ArrayList<>();
        recursion(root, li);
        return li;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = PostOrderTraversal(root);
        System.out.print("PostOrder traversal : ");
        for(int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}