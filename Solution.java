class Solution {
  
    public boolean isPalindrome(int x) {
      
    if(x < 0){
        return false;
    }  
         
    int len = 0, y = x, rev = 0, z = x;
      
    // Counting No. of digits  

    while(y != 0){
      y = y/10;
      len++;
    }

    len = len - 1;
      
    // Reversing the number

    while(len != -1){
        rev = rev + (x % 10) * ((int)Math.pow(10, len));
        len--;
        x = x/10;
    }
      
    // Comparing given number with the reversed number  
    
    return z==rev ? true : false;
      
    }
}
