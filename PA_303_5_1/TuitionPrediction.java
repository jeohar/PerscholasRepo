package PA_303_5_1;

public class TuitionPrediction {
    public static void main(String[] args) {
        double initialTuiion = 10000;
        double targetTuition = initialTuiion * 2;

        double increaseRate = 0.07;

        int years =0;
        double tuition = initialTuiion;
        while (tuition < targetTuition ){
            tuition *= (1 + increaseRate );
            years++;

        }
        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}
