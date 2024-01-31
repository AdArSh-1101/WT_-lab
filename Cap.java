import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cap {

    public static void main(String[] args) 
    {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                for (String word : words) {
                    if (word.length() > 0) {
                        String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
                        writer.write(capitalized + " ");
                    }
                }
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Successfully capitalized and saved the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}