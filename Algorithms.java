public class Algorithms
{
    public boolean containsString(String a, String b)
    {
        return a.contains(b);
    }
    public String reverseString(String str)
    {
        String result = "";
        for(int i = str.length(); i>0; i--)
        {
            result += str.substring(i-1, i);
        }
        return result;
    }
    public boolean isPalindrome(String str)
    {
        return str.equals(reverseString(str));
    }
    public int numOfOccurrences(String a, String b)
    {
        int result = 0;
        if (b.length() > a.length())
        {
            return result;
        }
        for(int i = b.length(); i <= a.length(); i++)
        {
            if (a.substring(i-b.length(), i).equals(b))
            {
                result++;
            }
        }
        return result;
    }

}
