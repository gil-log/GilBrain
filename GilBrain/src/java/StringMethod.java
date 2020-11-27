package purejava;

public class StringMethod {
    public static void main(String[] args) {

        String strReplace = "abcdeababcssababcabcddeee";
        strReplace = strReplace.replace("abc", "길");

        System.out.println(strReplace);

        String strReplaceAll = "abcdeababbssababcabcddeee";
        strReplaceAll = strReplaceAll.replaceAll("[abc]", "길");

        System.out.println(strReplaceAll);

    }
}
