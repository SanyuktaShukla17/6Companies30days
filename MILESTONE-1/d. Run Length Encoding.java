//Run length encoding
//link: https://practice.geeksforgeeks.org/problems/run-length-encoding/1

class GfG
 {
	String encode(String str)
	{ 
	    String s="";
	    int count=0;
	    
	    char temp = str.charAt(0);
	    for(int i=0; i<str.length(); i++){
	        
	        char ch = str.charAt(i);
	        if(ch==temp){
	            count++;
	        }
	        else{
	            s=s+temp+""+count+"";
	            temp=ch;
	            count=1;
	        }
	    } 
	     s=s+temp+""+count+"";
	   return s;
	}
	
 }
