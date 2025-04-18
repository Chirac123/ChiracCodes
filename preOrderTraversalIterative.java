import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.management.openmbean.ArrayType;

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
public class preOrderTraversalIterative {
    static public List<Integer> preOrderIterative(Node root){
        List<Integer> li = new ArrayList<>();
        if(root == null){
            return li;
        }
        Stack<Node> st = new Stack<>();
        st.add(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            li.add(curr.data);
            if(curr.right != null){
                st.add(curr.right);
            }
            if(curr.left != null){
                st.add(curr.left);
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

        List<Integer> result = preOrderIterative(root);
        System.out.println("Pre Order traversal Iterative: ");
        for(int val: result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
