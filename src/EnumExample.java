enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        //Using enum constants
        DayOfWeek today = DayOfWeek.MONDAY;
        System.out.println("Today is: " +today);

        //Switch statement with enum
        switch (today) {
            case MONDAY -> {
                System.out.println("It's start of the week");
                break;
            }
            case FRIDAY -> {
                System.out.println("TGIF!");
                break;
            }
            default -> {
                System.out.println("Just another day");
            }
        }

        System.out.println("Days of the week:");
        for(DayOfWeek day: DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}
