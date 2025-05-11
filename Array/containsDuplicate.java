import java.util.HashSet;
class containsDuplicate{
    public static boolean containsDuplicate(int[] nums) {
        // Using HashSet to store unique elements
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            // If the number is already in the set, return true
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
         
   /* This is a brute force solution with O(n^2) time complexity and O(1) space complexity.
    * The idea is to use two nested loops to check if there are any duplicates in the array.
    * The outer loop iterates through each element, and the inner loop checks all subsequent elements for duplicates.
    * If a duplicate is found, it returns true. If no duplicates are found after checking all elements, it returns false.
     
   public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j]){     
                    return true;
                }
            }
        }
        return false;
    }*/
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        Boolean ans = containsDuplicate(nums);
        System.out.print(ans);

    }
}