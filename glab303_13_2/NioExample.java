package glab303_13_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public static void main(String[] args) throws IOException {

        //initializing two files in Array
        String [] inputFiles = {"C:\\Users\\Jeoha\\OneDrive\\Desktop\\PerscholasHomeworks\\Files\\file1.txt","C:\\Users\\Jeoha\\OneDrive\\Desktop\\PerscholasHomeworks\\Files\\file2.txt"};
        //Specify out file with path location
        //Files content will be written in these files

        String outputFile = "C:\\Users\\Jeoha\\OneDrive\\Desktop\\PerscholasHomeworks\\Files\\nioOutput.txt";

        //Get Channel for destination or outputfile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for(int i = 0; i<inputFiles.length;i++){
            //get channel for inputfiles

            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();
            long size = inputChannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int) size);
            System.out.print((char) buf.get());

            while(inputChannel.read(buf)>0 ){
                buf.flip();
                while(buf.hasRemaining()){
                    targetChannel.write(buf);
                }

            }

        }


    }

}
