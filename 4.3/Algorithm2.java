public class Algorithm2 {
    public static boolean checkWord(String word1,String word2)
    {
        if (word1.length()<word2.length())
        {
            return false;
        } else {
            for (int i = 0; i <= word2.length()+1; i++)
            {
                try
                {
                    if (i+word2.length()<=word1.length())
                    {
                        String substring = word1.substring(i, i+word2.length());
                        if (substring.equals(word2))
                        {
                            return true;
                        }
                    }
                } catch (Exception e){
                    return false;
                }
            }
            return false;
        }
    }

    public static String reverseWord(String word)
    {
        String reverseString = "";
        for (int i = word.length(); i>=1; i--)
        {
            reverseString += word.substring(i-1, i);
        }
        return reverseString;
    }

    public static boolean palindromeCheck(String word)
    {
        int length = word.length();
        if (word.length()%2==1)
        {
            length = word.length()+1;
        }
        for (int i = 0; i<=length/2; i++)
        {
            if (word.substring(i,i+1).equals(word.substring(word.length()-i-1, word.length()-i))==false)
            {
                return false;
            }
        }
        return true;
    }

    public static int substringNum (String word, String substring)
    {
        int substringNum = 0;
        if (word.length() >= substring.length())
        {
            for (int i = 0; i <= word.length()-substring.length(); i++)
            {
                if (substring.equals(word.substring(i,i+substring.length())))
                {
                    substringNum += 1;
                }
            }
        }
        return substringNum;
    }
}