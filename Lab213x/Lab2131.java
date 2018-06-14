public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek currentDay : MyDayOfWeek.values()) {
            System.out.println(currentDay);
        }

    }

    enum MyDayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
