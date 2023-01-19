// link- https://leetcode.com/problems/shortest-unsorted-continuous-subarray/



class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int startindex=-1;
        int endindex=0;
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(arr[i]!=nums[i] && startindex==-1){
                ans=true;
               startindex=i;
            }
            if(arr[i]!=nums[i]){
                ans=true;
                endindex=i;
            }
        }
        if(ans){
            return endindex-startindex+1;
        }
        return 0;
    }
}

