class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26]; 
        int[] mag = new int[26]; 
        int max = magazine.length();
        if(ransomNote.length()>max)
        return false;
        for(int i = 0 ; i<max;i++){
            if(ransomNote.length()>i)
            ransom[ransomNote.charAt(i)-'a'] ++;
            mag[magazine.charAt(i)-'a'] ++;
        }
        for(int i = 0 ;i <26;i++)
        if(ransom[i]>mag[i])
        return false;
        return true;
        
    }
}