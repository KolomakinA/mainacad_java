package edu.testenum3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---------------------Railroad management simulator------------------------");
        System.out.println("--------------------------------------------------------------------------");
        TrainSchedule tc = new TrainSchedule();
        boolean exitSwitch = true;
        while(exitSwitch) {
            System.out.println();
            System.out.println("--------------------------Adding a train ------------------------------");
            tc.addTrain();
            System.out.println("------------------------------");
            System.out.print("Would you like to add one more train? Type YES or NO: ");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextLine().toUpperCase()){
                case "YES":
                    System.out.println("------------------------------");
                    continue;
                case "NO":
                    exitSwitch = false;
                    break;
            }
        }


        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("List of all trains: ");
        tc.printTrains();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Found trains: ");
        tc.searchTrain("Kyiv", "Odessa", DaysOftheWeek.WEDNESDAY);
        System.out.println("--------------------------------------------------------------------------");
    }
}
