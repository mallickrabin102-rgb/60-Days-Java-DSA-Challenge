import java.util.*;
public class palindromeSimple {
    static void Palindrome(String str){
        int left = 0;
        int right = str.length()-1;
        boolean isPlaindrome = true;
      while (left<right) {
        if (str.charAt(left)!=str.charAt(right)) {
            
            isPlaindrome = false;
            break;
            
        }
        
        left++;
        right--;
      }
System.out.println(isPlaindrome);

    }
    public static void main(String[] args) {
        String str = "madam";
    Palindrome(str);
    
    }
}
