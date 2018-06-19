import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9};
        String[] strArray = {"one","two","three","four","five","six","seven","eight","nine"};
        MyMixer<Integer> intMix = new MyMixer<>(intArray);
        MyMixer<String> strMix = new MyMixer<>(strArray);

        intMix.printArray();
        intMix.shuffle();
        intMix.printArray();

        strMix.printArray();
        strMix.shuffle();
        strMix.printArray();

    }
}

class MyMixer <T>{
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T[] shuffle(){
        Random random = new Random();
        for (int i = this.array.length-1; i>=0 ; i--) {
            T temp = this.array[i];
            int randomElement = random.nextInt(i+1);
            this.array[i]=this.array[randomElement];
            this.array[randomElement]=temp;
        }
        return this.array;
    }

    public void printArray(){
        for (T element:this.array){
            System.out.print(String.valueOf(element));
        }
        System.out.println();
    }
}

//Create new project called  TestGenerics3.
//
//        Add package “com.brainacad.oop.testgenerics3”.
//
//        1) Create a generic class MyMixer<T> with field as array of some type, provide constructor with one parameters.
//        Add to MyMixer public shuffle() method which shuffle elements of array and return it;
//
//        2) Create a class Main with a main() method. Add to method main() code that creates two array of different types:
//
//        First one is array of Integer with values {1,2,3,4,5,6,7,8,9}
//
//        Second one is array of String: {“one”,”two”, …}
//
//        3) Create two objects of MyMixer type and using each of arrays, invoke shuffle() method and print result to console.
//
//        4) Execute the program.
//
//        Example of program output:
//
//        [6,7,4,3,2,9,1,5,8]
//
//        [nine,one,two,five,…,] 
