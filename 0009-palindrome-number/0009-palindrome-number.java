class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false ;
        String temp= ""+x;
        for(int i = 0 ; i<temp.length()/2; i++)
            if(temp.charAt(i)!= temp.charAt(temp.length()-i-1))
                return false;
        return true;
        
    }
}