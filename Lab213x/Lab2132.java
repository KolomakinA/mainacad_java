public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek currentDay : MyDayOfWeek.values()) {
            switch (currentDay){
                case TUESDAY:
                    System.out.println(currentDay);
                    break;
                case THURSDAY:
                    System.out.println(currentDay);
                    break;
            }
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
