package ExtraActivities;

import java.util.Arrays;

public class ArraycopyExample {
    public static void main(String[] args) {
        int[] sourceArray = {2,5,6,9,12,-2};
        int[] targetArray = new int[sourceArray.length];
       // System.out.println(Arrays.toString(targetArray));

        System.out.println("Elements in the sourceArray --> " + Arrays.toString(sourceArray));
        System.out.println("Elements in the targetArray --> " + Arrays.toString(targetArray));

        System.arraycopy(sourceArray, 4, targetArray, 1, 2);

        //printing using toString
        System.out.println("Arrays after copy --> " + Arrays.toString(targetArray));
        //printing using forloop





        System.out.print("After copy from sourceArray ");
        for(int i =0; i<targetArray.length; i++)
        {

            System.out.print(targetArray[i] + ", ");


        }


    }

    public static class TestStringComparison {
        public static void main(String[] args) {

            String s1 = "PerScholas";
            String s2 = "PerScholas";
            String s3 = new String ("PerScholas");
            String s4 = "Teksystem";
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s1.equals(s4));

        }
    }

    public static class SubstringDemo {
        public static void main(String[] args) {
            String str1 = "java is fun";

            System.out.println(str1.substring(0,4));
        }
    }

    public static class StringUpper {
        public static void main(String[] args) {
            String str1 = "Hello How are you?";
            String str2 = str1.toUpperCase();
            System.out.println(str2);
        }
    }

    public static class StringTrim {
        public static void main(String[] args) {
            String str1 = "hello   ";
            System.out.println(str1+"how are you");
            System.out.println(str1.trim()+" how are you");
        }
    }

    public static class SplitPractice {
        public static void main(String[] args) {
            String vowels = "a::b::c::d::E";
            String[] result = vowels.split("::");
            System.out.println("result = " + Arrays.toString(result));
        }
    }

    public static class replaceAll {
        public static void main(String[] args) {
            String str1 = "Java123is456fun";

            // "\\d+" is a regular expression that matchs one or more digits
            String regex = "\\d+";
            //replace all occurance of numberic
            // digits by a space

            System.out.println(str1.replaceAll(regex, " "));

        }
    }

    public static class ConcatDemo {
        public static void main(String[] args) {
            String str1 = "Learn";
            String str2 = "Java";

            System.out.println(str2.concat(str1));
            System.out.println(str2.concat(str1));

            String str3 = "hello";
            String str4 = "Learners";
            String str5 = str3 + str4;
            String message = "Welcome " + "to" + "Java";
            String str6 = "Chapter" + 2;
            String str7 = "Supplement" + 'B';


        }
    }

    public static class CompareToDemo {
        public static void main(String[] args) {
            String s1 ="hello";
            String s2 ="hello";
            String s3 ="hemlo";
            String s4 ="zlag";

            System.out.println(s1.compareTo(s4));
        }
    }
}
