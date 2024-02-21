import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class lab1 {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";
        String inputFilePath = desktopPath + "/input2.txt2";
        String outputFilePath = desktopPath + "/output2.txt2";


        try (BufferedReader br = Files.newBufferedReader(Paths.get(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            while ((line = br.readLine()) != null) {


            }






        }

        catch (IOException e) {
            e.printStackTrace();
        }


    }
    }
