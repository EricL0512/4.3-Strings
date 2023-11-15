public class Main
{
    public static void main(String[] args)
    {
        Algorithms a = new Algorithms();
        System.out.println("containsString");
        System.out.println(a.containsString("antidisestablishmentarianism", "establish"));
        System.out.println(a.containsString("Bermuda", "Spain"));
        System.out.println("reverseString");
        System.out.println(a.reverseString("happy"));
        System.out.println(a.reverseString("juxtaposition"));
        System.out.println(a.isPalindrome("racecar"));
        System.out.println(a.isPalindrome("waffles"));
        System.out.println("numOfOccurrences:");
        System.out.println(a.numOfOccurrences("Mississippi", "si"));
        System.out.println(a.numOfOccurrences("Banana", "ana"));

    }
}
