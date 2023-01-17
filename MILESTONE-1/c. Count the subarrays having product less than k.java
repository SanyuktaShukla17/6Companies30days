//Count the subarrays having product less than k
//link: https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
         long p=1;
         int j=0,ans=0;
      for(int i=0;i<n;i++)
      {
          p*=a[i];
          while(j<n && p >= k)
          {
              p/=a[j++];
          }
          if(p<k){
          ans=ans+(i-j+1);
          }
      }
      return ans;
  
  }
    
}