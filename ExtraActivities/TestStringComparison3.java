package ExtraActivities;

public class TestStringComparison3 {
    public static void main(String[] args) {

        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = "PerSchola";
        String s4 = "PerScholasX";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1 (because s1 > s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1 < s4)



    }
}
