package ExtraActivities;

import java.text.DecimalFormat; //import package
public class DecimalFormatExample
{
    public static void main(String args[]) {
//formatting number upto 2 decimal places
        String pattern1 = "###,###.00"; // pattern according to which
       // number will be formatted
        DecimalFormat df = new DecimalFormat(pattern1); //object
        //creation and initialized with string
        System.out.println(df.format(987654341.9)); //pass number to
       // format method for formatting
        System.out.println(df.format(7654341.987));
//formatting upto 3 decimal places
        System.out.println("Formating upto 3 decimal places");
        String pattern2 = "#,###.000";
        df = new DecimalFormat(pattern2);
        System.out.println(df.format(100000098));
        System.out.println(df.format(10000000.98));
        System.out.println(df.format(10000000.98789));
    }
}
