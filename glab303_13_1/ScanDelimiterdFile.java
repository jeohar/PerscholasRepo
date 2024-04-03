package glab303_13_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {
    public static void main(String[] args) {
        try {
            String location = "C:\\Users\\Jeoha\\OneDrive\\Desktop\\PerscholasHomeworks\\Files\\cars.csv";
          File file = new File(location) ;
          Scanner input = new Scanner(file);
          ArrayList<String[]> data = new ArrayList<String[]>();

          while(input.hasNext()){
              String Line = input.nextLine();
              String[] splitLine = Line.split(",");
              data.add(splitLine);
          }
          for(String[] line : data) {
              System.out.println("Car Name: " + line[0]);
              System.out.println("MPG: " + line[1]);
              System.out.println("Cyliner: " + line [2]);
              System.out.println("Displacement: " + line[3]);
              System.out.println("Horsepower; " + line[4]);
              System.out.println("weight: " + line[5]);
              System.out.println("Acceleratio: " + line[6]);
              System.out.println("Model: " + line[7]);
              System.out.println("Origin: " + line[8]);
              System.out.println("===============================");

            }

        }catch(FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();

        }
    }
}
