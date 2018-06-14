import java.util.LinkedList;
import java.util.Scanner;

public class TrainSchedule {
    private LinkedList<Train> trains = new LinkedList<>();

    public TrainSchedule() {
    }

    public TrainSchedule(Train train) {
        this.trains.add(train);
    }

    public void addTrain(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter train's number: ");
        int newTrainNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter train's dispatch station: ");
        String newTrainDispStation = scanner.nextLine();

        System.out.print("Enter train's arrival station: ");
        String newTrainArrStation = scanner.nextLine();

        System.out.print("Enter train's dispatch time: ");
        String newTrainDispTime = scanner.nextLine();

        System.out.print("Enter train's arrival time: ");
        String newTrainArrTime = scanner.nextLine();

        System.out.print("Enter train's scheduled day of the week: ");
        String newTrainDay = scanner.nextLine().toUpperCase();

        Train currentTrain = new Train(newTrainNumber);
        currentTrain.setStationDispatch(newTrainDispStation);
        currentTrain.setStationArrival(newTrainArrStation);
        currentTrain.setTimeDispatch(newTrainDispTime);
        currentTrain.setTimeArrival(newTrainArrTime);

        switch (newTrainDay){
            case "MONDAY":
                currentTrain.setDays(DaysOftheWeek.MONDAY);
                break;
            case "TUESDAY":
                currentTrain.setDays(DaysOftheWeek.TUESDAY);
                break;
            case "WEDNESDAY":
                currentTrain.setDays(DaysOftheWeek.WEDNESDAY);
                break;
            case "THURSDAY":
                currentTrain.setDays(DaysOftheWeek.THURSDAY);
                break;
            case "FRIDAY":
                currentTrain.setDays(DaysOftheWeek.FRIDAY);
                break;
            case "SATURDAY":
                currentTrain.setDays(DaysOftheWeek.SATURDAY);
                break;
            case "SUNDAY":
                currentTrain.setDays(DaysOftheWeek.SUNDAY);
                break;
            default:
                System.out.println("Error: You've entered invalid day");
                System.exit(-1);

        }
        trains.add(currentTrain);
    }

    public void searchTrain(String searchDispStation,
                               String searchArrStation,
                               DaysOftheWeek searchDepartureAfterTheDay){

        LinkedList<Train> trainsFound = new LinkedList<>();
        for (Train currentTrain : trains) {
            if(
                            currentTrain.getStationDispatch().equalsIgnoreCase(searchDispStation) &&
                            currentTrain.getStationArrival().equalsIgnoreCase(searchArrStation) &&
                            (currentTrain.getDays().ordinal() > searchDepartureAfterTheDay.ordinal() &&
                                    currentTrain.getDays().ordinal() <= DaysOftheWeek.SUNDAY.ordinal()))
            {
                trainsFound.add(currentTrain);
            }
        }

        for (Train currentTrain : trainsFound) {
            System.out.println(currentTrain);
        }

    }

    public void printTrains(){
        for (Train currentTrain : trains) {
            System.out.println(currentTrain);
        }
    }

}

class Train{
    private int number;
    private String stationDispatch ;
    private String stationArrival  ;
    private String timeDispatch   ;
    private String timeArrival    ;
    private DaysOftheWeek days   ;

    public Train(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getStationDispatch() {
        return stationDispatch;
    }
    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }

    public String getStationArrival() {
        return stationArrival;
    }
    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    public String getTimeDispatch() {
        return timeDispatch;
    }
    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }

    public String getTimeArrival() {
        return timeArrival;
    }
    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public DaysOftheWeek getDays() {
        return days;
    }
    public void setDays(DaysOftheWeek days) {
        this.days = days;
    }

    @Override
    public String toString(){
        return String.format("Train no. %s, that goes each %s from %s to %s, dispatching at %s and arriving at %s",
                getNumber(),
                getDays().name(),
                getStationDispatch(),
                getStationArrival(),
                getTimeDispatch(),
                getTimeArrival());
    }
}

enum DaysOftheWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
