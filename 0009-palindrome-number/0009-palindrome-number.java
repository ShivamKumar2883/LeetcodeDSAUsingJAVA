class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,u,pal=x;
        while(x>0){
            u=x%10;
            rev=(rev*10)+u;
            x=x/10;
        }
        if(rev==pal)
        return true;
        else 
        return false;
    }
}