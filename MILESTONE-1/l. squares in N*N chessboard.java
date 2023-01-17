class Solution {

    static Long squaresInChessBoard(Long N) {

        long ans=1;

        if(N==1)return ans;

         long sum=0;

        for(long i=1;i<=N;i++){

            sum+=i*i;

        } 

        return sum;

    }

};

