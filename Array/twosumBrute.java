class twosumBrute{
    public static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;

    }
    public static void arrayConversion(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(arr, target);
        arrayConversion(ans);
    }

}