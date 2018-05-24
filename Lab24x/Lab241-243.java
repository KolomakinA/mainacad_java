import java.util.Arrays;

public class Calculation {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,8};

        System.out.println(MyMath.findMin(arr1));
        System.out.println(MyMath.findMax(arr2));
    }
}

class MyMath{
    final static double PI = Math.PI;
    public static double areaOfCircle(double radius){
        return PI*Math.pow(radius,2);
    }
    public static int findMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
