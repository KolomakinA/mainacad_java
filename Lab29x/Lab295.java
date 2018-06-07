import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String [] stringArray = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        System.out.println("Condition: begin from Uppercase, then other chars in Lowercase and contains only letters");
        for (String input:stringArray ) {
            System.out.println(String.format("The string \"%s\" does match the rule: %s",input,checkPersonWithRegExp(input)));
        }
    }
    public static boolean checkPersonWithRegExp(String userNameString){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();
    }
}
