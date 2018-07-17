package com.brainacad.oop.testwrapper;

/*
Create new project called  TestThread2. Add package “com.brainacad.oop.testthread2”.

Create a class MySumCount which extends the Thread class. Add to class  MySumCount
two integer fields startIndex and stopIndex with setters and getters. Add to class
MySumCount  new field as array of integer type and setter for it. Add to class
MySumCount  new field resultSum of long type and getter for it.

Override the run() method of Thread. Add code to calculate sum of array elements from
startIndex to stopIndex and save result to resultSum field.

Create a class Main with a main() method. Add to method main() code that declares local
variable myArray as array of integer type (of 1000 size), and create two instances of
MySumCount.  Add code to fill all elements of myArray with random integer values
generated from 0 to 1000 range. Add code to calculates sum of myArray elements in two
separate thread and then print result to console.

Execute the program.

The program output must be like next example:
[324,234,523,…,643]
Sum of array elements: 123457
*/
public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[1000];
        MySumCount sumCount1 = new MySumCount();
        MySumCount sumCount2 = new MySumCount();

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 1000);
        }

        sumCount1.setIntArray(myArray);
        sumCount2.setIntArray(myArray);

        sumCount1.setStartIndex(0);
        sumCount2.setStartIndex(499);

        sumCount1.setStopIndex(499);
        sumCount2.setStopIndex(999);

        sumCount1.run();
        sumCount2.run();

        System.out.println(sumCount1.getResultSum());
        System.out.println(sumCount2.getResultSum());
    }
}

class MySumCount extends Thread{
    private int startIndex;
    private int stopIndex;
    private int[] intArray;
    private long resultSum;

    public long getResultSum() {
        return resultSum;
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    public int getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    public int getStopIndex() {
        return stopIndex;
    }
    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    @Override
    public void run(){
        for (int i = startIndex; i < stopIndex; i++){
            resultSum = resultSum + intArray[i];
        }
    }
}
