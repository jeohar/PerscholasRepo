package PA303_10_1;

public class StoneMonester extends Monster{


    public StoneMonester(String str) {
        super(str);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }


}
