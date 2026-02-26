public class PalindromeCheckerApp {
    public static void main(String[] var0) {
        String phrase="madam";
        int i,n;
        String reversed="";
        n=phrase.length();
        for(i=n-1;i>=0;i--){
            reversed=reversed+phrase.charAt(i);
        }
        if(phrase.equals(reversed)){
            System.out.println("Is it a Palindrome? : true");
        }else{
            System.out.println("Is it a Palindrome? : false");
        }
    }
}