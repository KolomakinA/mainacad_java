public class Main {
    public static void main(String[] args) {
        System.out.println(MyDayOfWeek.SUNDAY.nextDay());
        System.out.println(MyDayOfWeek.MONDAY.nextDay());
    }

    enum MyDayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
        String nextDay(){
            int currentDayIndex = MyDayOfWeek.valueOf(this.name()).ordinal();
            if (!(this.name().equals(SUNDAY.name()))) {
                    return String.format("The next day of week: %s",MyDayOfWeek.values()[currentDayIndex+1] );
                } else {
                    return String.format("The next day of week: %s",MONDAY.name());
                }
        }
    }
}
