package ExtraActivities;

public class ArrayAverage {
    public static void main(String[] args) {

        int [] num = {22,55,3,6,99,88,74,2,1,6,8,4,25,66,9,99};
        int sum = 0;
        int avg = 0;
        for(int i = 0; i<num.length; i++){
            sum+=num[i];
            avg = sum/num.length;

        }
        System.out.println("Array Length: " + num.length);
        System.out.println("Sum = " + sum);

        System.out.println("Average = " + avg);
    }

    public static class TestStringComparison2 {
        public static void main(String[] args) {

            String s1 = "PerScholas";
            String s2 = "PerScholas";
            String s3 = new String ("PerScholas");
            String s4 = "Teksystem";
            System.out.println(s1==s2);
            System.out.println(s1==s3);


        }
    }

    public static class StringLower {
        public static void main(String[] args) {
            String str1 = "Hello How are you?";
            String str2 = str1.toLowerCase();
            System.out.println(str2);
        }
    }

    public static class PracticeClass {
        public static void main(String[] args) {
            /*
            Write a program that declares two integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.

             */
            int a = 10;
            int b = 30;
            int sum = a + b;

                System.out.println("Sum of " + a + " & " + b + " = " + sum );

             /*
             Write a program that declares two double variables,
             assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
              */

            double x = 999.95;
            double y = 253.05;
            double result = x + y;

                System.out.println("Sum of " + x + " & " + y + " = " + result );

             /*
             Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
             Assign the sum to a variable. Print out the result. What variable type must the sum be?
              */

            int x1 = 99;
            double y1 = 99.99;
            double result1 = x1 + y1;
                System.out.println("Sum of " + x1 + " & " +  String.format("%.2f", y1) + " = " + String.format("%.2f", result1));

            /*
            Write a program that declares two integer variables, assigns an integer to each, and divides the larger number
             by the smaller number. Assign the result to a variable.
            Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
             */

            int x2 = 88;
            double y2 = 99.99;
            double result2 = y2/x2;

                System.out.println(String.format("%.2f", y2) + " divides to " + x2 + " = " + String.format("%.2f", result2));

                /*
              Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
              Assign the result to a variable.
              Print out the result. Now, cast the result to an integer. Print out the result again.
                 */

            double x3 = 99.55;
            double y3 = 22.96;

            double result3 = x3/y3;
                System.out.println(x3 + " divides to " + y3 + " = " + String.format("%.2f",  result3));
            //Now, cast the result3 to an integer

            int result4 = (int) result3;
                System.out.println(result4);

                /*
             Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
             Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
                 */

            int x4 = 5;
            int y4 = 6;
            double q = y4/x4;

                System.out.println("the result(q) is " + q);

            // Now, cast y to a double and assign it to q. Print q again.
            q = (double) y4;
                System.out.println("the result(q) after casting to double value is  " + q);

            /*
            Write a program that declares a named constant and uses it in a calculation. Print the result.
             */
            final double PI = 3.14159;

            // Declare variables for calculation
            double radius = 5.0;

            // Calculate the area of a circle using the constant
            double area = PI * radius * radius;

            // Print the result
            System.out.println("The area of the circle is: " + area);

            /*
            Write a program where you create three variables that represent products at a cafe. The products could be beverages
            like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more variables called
            subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product,
             and two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX
            and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.

             */

            float cappuccino = 15.99F * 3;
            float espresso = 12.99F * 4;
            float  greenTea = 6.99F * 2;
            final float SALES_TAX = 0.09F;
            double subtotal = cappuccino + espresso + greenTea;
            double subtotalTax = subtotal * SALES_TAX;
            double totalSale =  subtotal + subtotalTax ;
            System.out.println("Total sale is: " + String.format("%.2f", totalSale ));
















        }
    }

    public static class LengthDemo {
        public static void main(String[] args) {
            String str1 = "Java";
            String str2 ="";
            System.out.println(str1.length());
            System.out.println(str2.length());
            System.out.println("Java".length());
            System.out.println("Java\n".length());
            System.out.println("Learn Java".length());
        }
    }

    public static class IsEmptyExample {
        public static void main(String args[]){
            String str1 =" ";
            String str2 = "hello";
            System.out.println(str1.isEmpty() || str1.isBlank());
            System.out.println(str2.isEmpty());
        }
    }

    public static class findString {
        public static void main(String[] args) {
            String str1 = "Java is fun";
            int result;

            result = str1.indexOf('S');
            System.out.println(result);
            result = str1.lastIndexOf('J');

            result = str1.lastIndexOf('a');
            System.out.println(result);

        }
    }

    public static class ContainExample {
        public static void main(String[] args) {
            String str1 = "Learn Java";
            Boolean result;

            //Chek if str1 contains Java

            result = str1.contains("Java");
            System.out.println(result);

            //Check if str1 contains python

            result = str1.contains("Python");
            System.out.println(result);

            //check if str1 contains " "
            result = str1.contains("");
            System.out.println(result);


        }
    }
}
