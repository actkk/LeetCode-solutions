class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0 ;i <s.length();i++)
        {
            String newstrg= s.substring(i)+s.substring(0,i);
            if(newstrg.equals(goal))
            return true;
        }
        return false;
        
    }
}