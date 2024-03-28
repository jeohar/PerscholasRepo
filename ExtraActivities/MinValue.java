package ExtraActivities;

public class MinValue {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 4, 6, 8, 10};
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i<myarray.length;i++){
            if(myarray[i]<minVal){
                minVal = myarray[i];
            }
        }
        System.out.println(minVal);




    }
}
