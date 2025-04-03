class Solution {
    public boolean isPowerOfThree(int n) {
        if(n%2==0 || n%11==0 || n%5==0 || n%7==0 || n%13==0 || n%17==0 || n%19==0 || n%23==0 || n%31==0 || n%37==0 || n%41==0 || n%43==0 || n%47==0 || n%53==0 )
        return false;
        else
            return checker(n);
    }
    public boolean checker(int n){
        if(n==1)
        return true;
       else if(n<1)
        return false;
       else  if(n%3!=0)
        return false;
       else 
        return isPowerOfThree(n/3); 

        
    }
}