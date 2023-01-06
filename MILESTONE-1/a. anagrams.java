//sanyukta shukla
//Title: Print Anagrams Together
//Link: https://practice.geeksforgeeks.org/problems/print-anagrams-together/1

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        
        TreeMap<String,List<String>> m=new TreeMap<>();
        
        for(int i=0; i<string_list.length; i++){
            char [] c = string_list[i].toCharArray();
            Arrays.sort(c);
            
            String s = String.valueOf(c);
            if(m.containsKey(s)){
                m.get(s).add(string_list[i]);
            }
            else{
                List<String> l =new ArrayList<>();
                l.add(string_list[i]);
                m.put(s,l);
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        
        for(String k : m.keySet()){
            ans.add(m.get(k));
        }
        return ans;
        
    }
}
