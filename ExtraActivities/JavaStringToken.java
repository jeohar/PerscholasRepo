package ExtraActivities;
import java.util.Scanner;
public class JavaStringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(tokens.length);
        for (String tokens1 : tokens) {
            System.out.println(tokens1);

        }
        scan.close();
    }
}