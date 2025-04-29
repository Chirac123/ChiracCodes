package BinaryTrees;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
public class inOrderTraversaliterative {
    static List<Integer> inOrderTraversal(Node root){
        List<Integer> li =  new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(true){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                curr = st.pop();
                li.add(curr.data);
                curr = curr.right;
            }
        }
        return li;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = inOrderTraversal(root);
        System.out.print("InOrder traversal : ");
        for(int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
