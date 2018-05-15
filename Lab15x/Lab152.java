
public class Lab152 {
    public static void main(String[] args) {
        System.out.print("Enter an integer number: ");
        Scanner intInput = new Scanner(System.in);
        int x = intInput.nextInt();

        if (x == 1) System.out.println("One");
        else if (x == 2) System.out.println("Two");
        else if (x == 3) System.out.println("Three");
        else if (x == 4) System.out.println("Four");
        else if (x == 5) System.out.println("Five");
        else {
            switch (x){
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");

            }
        }
    }
}
