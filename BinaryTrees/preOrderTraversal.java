package BinaryTrees;
import java.util.ArrayList;
import java.util.List;

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
class preOrderTraversal{ 
     static void recursion(Node root, List<Integer> li){
        if(root == null){
            return;
        }
        li.add(root.data);
        recursion(root.left, li);
        recursion(root.right, li);  
    }  
    static List<Integer> preOrder(Node root){
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

        List<Integer> result = preOrder(root);
        System.out.println("PreOrder traversal is: ");
        for(int val: result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}