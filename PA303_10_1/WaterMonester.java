package PA303_10_1;

public class WaterMonester extends Monster{


    public WaterMonester(String str) {
        super(str);
    }

    @Override
    public String attack() {
       return "Attack with water!";
    }
}
