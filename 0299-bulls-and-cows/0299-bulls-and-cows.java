class Solution {
    public String getHint(String secret, String guess) {
        int allcorrect = 0 ;
        int badposs=0;
        for(int i = 0 ; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                secret = secret.substring(0, i)+"A"+secret.substring(i+1);
                guess = guess.substring(0, i)+"B"+guess.substring(i+1);


                allcorrect ++;
            }
        }
        for(int i = 0 ; i<guess.length();i++)
        { 
            if(secret.contains(""+guess.charAt(i)))
            {
                badposs++;
                secret = secret.substring(0, secret.indexOf(guess.charAt(i)))+"A"+secret.substring(secret.indexOf(guess.charAt(i))+1);
                guess = guess.substring(0, i)+"B"+guess.substring(i+1);




            }
        }

        return ""+allcorrect+"A"+badposs+"B";
    }
}