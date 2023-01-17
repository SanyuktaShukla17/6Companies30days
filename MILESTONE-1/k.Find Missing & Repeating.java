class Solve {
    int[] findTwoElement(int arr[], int n) {
        int []ans=new int[2];

 Map<Integer,Integer>hm=new HashMap<>();

 for(int i=0;i<nums.length;i++){

 int val=hm.getOrDefault(nums[i],0);

 if(val==1) ans[0]=nums[i];

 hm.put(nums[i],val+1);

 }

 for(int i=1;i<=nums.length;i++){

 int val=hm.getOrDefault(i,0);

 if(val==0) ans[1]=i;

 }

 return ans;
    }
}
