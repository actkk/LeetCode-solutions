class Solution {
    public boolean rotateString(String s, String goal) {
        s= s+s;
        if(goal.length()==s.length()/2 && s.contains(goal))
         return true;
        return false;
        
    }
}