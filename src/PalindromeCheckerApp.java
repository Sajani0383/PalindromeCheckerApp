public class PalindromeCheckerApp {
    public static void main(String[] var0) {
        String phrase="Shirley";
        int i,n;
        String reversed="";
        n=phrase.length();
        for(i=n-1;i>=0;i--){
            reversed=reversed+phrase.charAt(i);
        }
        if(phrase.equals(reversed)){
            System.out.println(reversed+" is a Palindrome");
        }else{
            System.out.println(reversed+" is not a Palindrome");
        }
    }
}