public class ReplaceExample
{
    public static void main(String[] args)
    {
        String str = "javaguides";
        String subStr = str.replace('a', 'b');
        System.out.println("replace char 'a' with char 'b' from given string : " + subStr);
        subStr = str.replace("guides", "tutorials");
        System.out.println("replace guides with tutorials with given string : " + subStr);
        subStr = str.replaceAll("[a-z]", "java");
        System.out.println(subStr);
        subStr = str.replaceFirst("[a-z]", "java");
        System.out.println(subStr);
    }
}
