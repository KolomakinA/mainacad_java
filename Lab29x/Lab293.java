public class Main {
    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }

    private static char[] uniqueChars (String inputString){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length() ; i++) {
            if (sb.toString().indexOf(inputString.charAt(i)) == -1 ) {
                sb.append(inputString.charAt(i));
            }
        }
        return sb.toString().toCharArray();
    }
}
