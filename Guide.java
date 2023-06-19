public class Guide
{
    public static void main(String[] args)
    {
        String str = new String("Java Guides");
        // create String object using new Keyword
        int length = str.length();
        System.out.println(" length of the string '" + str + "' is:: " + length);

        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: " + str.charAt(0));
        // The last character is present at the string length-1 index
        System.out.println("Character at last index is: " + str.charAt(strLength - 1));
    }
}
