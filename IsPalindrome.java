public class IsPalindrome
 {
    public static boolean ispalindrome(String str)

    {
        for ( int i = 0;  i<str.length()/2;  i++ )

        {
            int n= str.length();
            if ( str.charAt(i) != str.charAt(n-1-i) )

            {
                //not in palindrome
                return false;
            }
        
        }
        // is a palindrome
        return true;

    }

    public static void main (String[] args)

    {
        String str = "noon";
        System.out.println(ispalindrome(str));

    }
    
}
