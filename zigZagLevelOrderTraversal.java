import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        data = val;
        left = null;
        right = null;
    }
}
class zigZagLevelOrderTraversal{
    static public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> li = new LinkedList<>();
      if(root == null) return li;
      Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
      boolean reverse = false;
      while(!q.isEmpty()){
        int n = q.size();
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            TreeNode curr = q.poll();
            list.add(curr.data);
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);

        
        }
        if(reverse){
            Collections.reverse(list);
        }
        li.add(list);
        reverse = !reverse;
      }
      return li;
    }
    public static void printList(List<Integer> val){
        for(int num: val){
            System.out.print(num);
        }
        
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        List<List<Integer>> list = zigzagLevelOrder(root);
        System.out.print("ZigZag level order tarversal: ");
        for(List<Integer> val:  list){
            printList(val);
        }
    }
}