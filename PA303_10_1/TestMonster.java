package PA303_10_1;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new FireMonester("r2u2");
        Monster m2 = new WaterMonester("u2r2");
        Monster m3 = new StoneMonester("r2r2");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        //m1 dies, generate a new instance and re-assign m1
        m1 = new StoneMonester("a2b2");

        System.out.println(m1.attack());

        //we have problem here!!!


        //Since the abstract parent class is not instantiatable, thus the code on line 20 and 21 will generate error.

//        Monster m4 = new Monster("u2u2");
//        System.out.println(m4.attack());




    }
}
