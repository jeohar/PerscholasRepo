package glab303_13_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {

    public static void main(String[] args) throws IOException {

        //Input files
        String [] inputFiles = {"C:\\Users\\Jeoha\\OneDrive\\Desktop\\PerscholasHomeworks\\Files\\file1.txt","C:\\Users\\Jeoha\\OneDrive\\Desktop\\PerscholasHomeworks\\Files\\file2.txt"};

        //Files content will be written in these files
        String outputFile = "C:\\Users\\Jeoha\\OneDrive\\Desktop\\PerscholasHomeworks\\Files\\nioOutput2.txt";
        //Get Channel for output file
        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();

        for(int i= 0; i<inputFiles.length; i++){
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to outout channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }
        //finally close the target channel
        targetChannel.close();
        fos.close();
    }

}
