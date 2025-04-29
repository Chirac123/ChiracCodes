package BinaryTrees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

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
class levelOrderTraversal{
    public static List<List<Integer>> levelOrderTraversal(Node root) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        Queue<Node> q = new LinkedList<>();
        if(root == null){
            return li;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<n;i++){
                Node curr = q.poll();
                subList.add(curr.data);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            li.add(subList);
        }
        return li;
    }
    public static void printList(List<Integer> val){
          for(int num: val){
            System.out.print(num + " ");
          }  
         // System.out.println();
    }
    public static void main(String[] args) {
    
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> result = levelOrderTraversal(root);
        System.out.print("Level order traversal : ");
        for(List<Integer> val : result){
            printList(val);
        }
        
    }
}