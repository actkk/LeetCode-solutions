class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) 
            return false; 
        boolean vowel = false , consonant =false  ;
        word = word.toLowerCase();
        for(int i = 0 ; i <word.length();i++)
        {
            if( !((word.charAt(i)>='a' && word.charAt(i)<='z' ) || (word.charAt(i)>='0' && word.charAt(i)<='9')))
                    return false;
            if((word.charAt(i)>='a' && word.charAt(i)<='z' )){
                if((word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ))
                vowel = true;
                else 
                consonant = true;


            }
        }
            if(vowel && consonant)
            return true;

        return false;
    }
}