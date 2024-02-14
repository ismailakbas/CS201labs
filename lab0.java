import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class lab0 {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";
        String inputFilePath = desktopPath + "/input.txt";
        String outputFilePath = desktopPath + "/output.txt";


        try (BufferedReader br = Files.newBufferedReader(Paths.get(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());
                    if (isPrime(number)) {
                        System.out.println("Prime");
                        bw.write(number + " Prime");
                    } else {
                        System.out.println("Not Prime");

                    }
                    bw.newLine();
                } catch (NumberFormatException e) {
                    System.err.println("?" + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}