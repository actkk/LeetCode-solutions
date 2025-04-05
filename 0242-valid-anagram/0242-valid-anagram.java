class Solution {
    public boolean isAnagram(String s, String t) {
        for (int i = 0 ;i<s.length(); i++)
        {
            if(t.contains(""+s.charAt(i))){
                 t = t.substring(0,t.indexOf(s.charAt(i)))+""+t.substring(1+t.indexOf(s.charAt(i)));
            }
            else
                return false;
        }
        if(t.isEmpty())
            return true;
        return false;
        
    }
}