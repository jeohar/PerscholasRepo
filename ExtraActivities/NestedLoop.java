package ExtraActivities;

public class NestedLoop {
    public static void main(String[] args) {


        weekdays(5, 7);
    }

        private static void weekdays (int weeks, int days){

        for (int i = 1; i <= weeks; i++) {
            System.out.println("Weeks " + i);
            for (int j = 1; j <= days; j++) {
                System.out.println("days " + j);

        }
        }
    }
}
