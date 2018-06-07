public class Main {

    public static void main(String[] args) {
	    String myStr = "abracadabra";

        System.out.println(String.format("Index of a first \"ra\" substring: %s",myStr.indexOf("ra")));
        System.out.println(String.format("Index of a last \"ra\" substring: %s",myStr.lastIndexOf("ra")));
        System.out.println(String.format("Substring of myStr from 3 to 7 char index: %s",myStr.substring(3,7)));
        System.out.println(String.format("Reverted string myStr: %s",reverseString(myStr)));
    }

    static String reverseString(String input){
        StringBuilder output = new StringBuilder();
        for (int i = input.length()-1; i >=0 ; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}
