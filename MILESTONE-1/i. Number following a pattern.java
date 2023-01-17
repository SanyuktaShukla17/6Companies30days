class Solution{

    static String printMinNumberForPattern(String S){

        // code here

        String ans = "";

        String smallAns = "1";

        int val = 2;

        for(int i = 0 ; i < S.length() ; i++){

            if(S.charAt(i)=='D'){

                smallAns=val+smallAns;

                val++;

            }else{

                ans+=smallAns;

                smallAns="";

                smallAns+=val;

                val++;

            }

        }

        ans=ans+smallAns;

        return ans;

    }

}

 
