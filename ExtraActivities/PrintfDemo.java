package ExtraActivities;

public class PrintfDemo {
    public static void main(String[] args) {
        String[] fullNames = new String[] {"Tom", "Jerry", "Donald"};
        float[] salaries = new float[] {1000, 1500, 1200};
        System.out.printf("|%-10s | %-30s | %-15s |%n", "No", "Full", "Name", "Salary");
        for(int i=0; i< fullNames.length; i++) {
            System.out.printf("|%-10d | %-30s | %15f |%n", (i+1),
                    fullNames[i], salaries[i]);

        }
}
}
