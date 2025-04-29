package BinaryTrees;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Node;

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
public class postOrderTraversaliterative {
    static List<Integer> PostOrderTraversal(Node root){
        List<Integer> li = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        if(root == null){
            return li;
        }
        st1.add(root);
        while(!st1.isEmpty()){
            Node curr = st1.pop();
            st2.add(curr);
            if(curr.left != null){
                st1.push(curr.left);
            }
            if(curr.right != null){
                st1.push(curr.right);
            }
        }
        while(!st2.isEmpty()){
            li.add(st2.pop().data);
        }
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
