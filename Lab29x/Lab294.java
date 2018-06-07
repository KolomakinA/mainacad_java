import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Andrii Kolomakin";
        StringTokenizer strTok = new StringTokenizer(myStr," ,.");
        while(strTok.hasMoreTokens()){
            System.out.println(strTok.nextToken());
        }
    }
}
