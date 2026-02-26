import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] var0) {
        String input="suthish";
        int i,n;
        Stack<Character> stack=new Stack<>();
        for(char c:input.toCharArray()){
            stack.push(c);
        }
        boolean isPalindrome=true;
        for(char c:input.toCharArray()){
            char poppedChar=stack.pop();
            if(c!=poppedChar){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string \""+input+"\" is a palindrome.");
        }else{
            System.out.println("The string \""+input+"\" is not a palindrome.");
        }
    }
}