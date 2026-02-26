public class PalindromeCheckerApp {
    public static void main(String[] var0) {
        String phrase="madam";
        int i,n;
        boolean isPalindrome=true;
        n=phrase.length()-1;
        for(i=0;i<phrase.length()/2;i++){
            if(phrase.charAt(i)!=phrase.charAt(n-i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Is it a Palindrome? : true");
        }else{
            System.out.println("Is it a Palindrome? : false");
        }
    }
}