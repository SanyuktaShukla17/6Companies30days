

class Solution
{
    static int mod = 1000000007;
    public int CountWays(String str)
    {
        
        int[] dp = new int[str.length()+1];
        dp[str.length()] = 1;
        for(int i = str.length() - 1; i >= 0; i--){
            int x1 = 0;
            if(str.charAt(i) != '0'){
                x1 = dp[i+1];
            }
            int x2 = 0;
            if(str.charAt(i) != '0' && i+1 < str.length()){
                int ele = Integer.parseInt(str.substring(i,i+2));
                if(ele > 9 && ele < 27){
                    x2 = dp[i+2];
                }
            }
            dp[i] = (x1+x2) % mod;
        }
        return dp[0];
    }
}
