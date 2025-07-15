class Solution {
    public String longestCommonPrefix(String[] strs) {
        String x="";
        int min = strs[0].length() ; 
        for(int i = 1 ; i < strs.length ; i++){
            if(strs[i].length()<min)
            min = strs[i].length();
        }
        for(int i = 0 ; i < min ; i++){
            char temp = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length ; j++){
                if(temp != strs[j].charAt(i))
                    return  x;

        }
        x= x+""+temp;
    }
    return x;
}}