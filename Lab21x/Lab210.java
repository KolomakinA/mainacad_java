public class Main {

    public static void main(String[] args) {

	// write your code here
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);
        Integer x4 = Integer.parseInt("10");

        Integer ux1 = 200;
        Integer ux2 = new Integer(200);
        Integer ux3 = Integer.valueOf(200);
        Integer ux4 = Integer.parseInt("200");

        System.out.println(x1 == x2);
        System.out.println(x2 == x3);
        System.out.println(x3 == x4);

        System.out.println(ux1 == ux2);
        System.out.println(ux2 == ux3);
        System.out.println(ux3 == ux4);

    }
}
