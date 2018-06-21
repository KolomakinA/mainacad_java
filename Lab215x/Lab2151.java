//Create new project called  TestCollection1.
//        Add package “com.brainacad.oop.testcollection1”.
//        Create a class Main with a main() method. Add to method main() code that declares
//        list variable (of List type) of string objects as ArrayList<String>.
//        Write code to fill this list in loop with string values like: “number_” and number
//        of current iteration (from 0 to 10). Add code which iterates over list and print
//        current element value to console.
//        Execute the program.
//
//        The program output must be like next example:
//        number_0
//        number_1
//        number_2
//        …
//        number_9

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= 10 ; i++) {
            list.add("number_"+i);
        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
