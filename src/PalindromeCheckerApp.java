public class PalindromeCheckerApp {
    public static void main(String[] var0) {
        String phrase="radar";
        int i,n;
        char[] chars=phrase.toCharArray();
        int start=0;
        int end=chars.length-1;
        boolean isPalindrome=true;
        while(start<end){
            if(chars[start] != chars[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input: "+phrase);
        System.out.println("Is palindrome?: "+isPalindrome);
    }
}