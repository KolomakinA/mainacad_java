public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.println(findAbsentChars(myStr1,myStr2));

    }

    private static String findAbsentChars(String s1, String s2){
        StringBuilder result = new StringBuilder();
        s1 =s1.toLowerCase();
        s2 =s2.toLowerCase();

        for (int i = 0; i < s1.length() ; i++) {
            String currentChar = String.valueOf(s1.charAt(i));
            if (s2.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
