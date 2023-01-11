//Link: geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    static int findPosition(int N , int M , int K) {
     
     if(N==1) return 1;
     int element = M + K - 1;
     if(element%N == 0){
         return N;
     }
     return element%N;
    }
};
