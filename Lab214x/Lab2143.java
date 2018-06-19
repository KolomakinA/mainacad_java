package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9};
	    Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        System.out.println(MyTestMethod.calcNum(intArray,3));
        System.out.println(MyTestMethod.calcNum(doubleArray,3));

        System.out.println(MyTestMethod.calcSum(intArray,3));
        System.out.println(MyTestMethod.calcSum(doubleArray,3));

    }
}

class MyTestMethod {
    public static <T extends Number> int calcNum(T[] array, T maxElem){
        int  counter = 0;
        for(T arrayElement:array){
            if(arrayElement.doubleValue() > maxElem.doubleValue()){
                counter++;
            }
        }
        return counter;
    }
    public static <T extends Number> double calcSum(T[] array, T maxElem){
        double sum = 0;
        for(T arrayElement:array){
            if(arrayElement.doubleValue() > maxElem.doubleValue()){
                sum+=arrayElement.doubleValue();
            }
        }
        return sum;
    }
}


//    Open project called  TestGenerics2 (from 2-14-2 lab).
//
//        1) Rewrite a class MyTestMethod to add new generic static method calcSum (with two parameters: an array T[] and variable maxValue of type T)
//        that calc sum of the number of elements in an array T[] that are greater than a specified value maxValue.
//
//        2) Add to method main() code that creates two array, first – array of Integer type and second – array of Double type. Fill these arrays with
//        some random values.
//
//        Add code to counts the total sum of elements in each of arrays,  that are greater than a specified element by invoking calcSum() static method.
//
//        3) Execute the program.
//
//        The program output must be like next example:
//
//        Array values: [1,2,3,4,5,6,7,8,9]
//
//        Sum of elements that are greater than 3:
//
//        39
//
//        Array values: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
//
//        Sum of elements that are greater than 3:
//
//        46.2 
