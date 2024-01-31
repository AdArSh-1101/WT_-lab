import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) throws IOException {
        // read in csv file
        File file = new File("iris.csv");
        Scanner scanner = new Scanner(file);

        // create list to store Iris objects
        List<Iris> irisList = new ArrayList<>();

        // iterate over csv file and create Iris objects
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            double sepalLength = Double.parseDouble(values[0]);
            double sepalWidth = Double.parseDouble(values[1]);
            double petalLength = Double.parseDouble(values[2]);
            double petalWidth = Double.parseDouble(values[3]);
            String name = values[4];
            Iris iris = new Iris(sepalLength, sepalWidth, petalLength, petalWidth, name);
            irisList.add(iris);
        }

        // convert list to array
        Iris[] irisArray = irisList.toArray(new Iris[0]);

        // find min, max, average, and standard deviation of each column
        double[] sepalLengths = new double[irisArray.length];
        double[] sepalWidths = new double[irisArray.length];
        double[] petalLengths = new double[irisArray.length];
        double[] petalWidths = new double[irisArray.length];
        for (int i = 0; i < irisArray.length; i++) {
            sepalLengths[i] = irisArray[i].getSepalLength();
            sepalWidths[i] = irisArray[i].getSepalWidth();
            petalLengths[i] = irisArray[i].getPetalLength();
            petalWidths[i] = irisArray[i].getPetalWidth();
        }

        double minSepalLength = min(sepalLengths);
        double maxSepalLength = max(sepalLengths);
        double avgSepalLength = avg(sepalLengths);
        double stdSepalLength = std(sepalLengths);

        double minSepalWidth = min(sepalWidths);
        double maxSepalWidth = max(sepalWidths);
        double avgSepalWidth = avg(sepalWidths);
        double stdSepalWidth = std(sepalWidths);

        double minPetalLength = min(petalLengths);
        double maxPetalLength = max(petalLengths);
        double avgPetalLength = avg(petalLengths);
        double stdPetalLength = std(petalLengths);

        double minPetalWidth = min(petalWidths);
        double maxPetalWidth = max(petalWidths);
        double avgPetalWidth = avg(petalWidths);
        double stdPetalWidth = std(petalWidths);

        // print results

        System.out.println("Sepal Length");
        System.out.println("Min: " + minSepalLength);
        System.out.println("Max: " + maxSepalLength);
        System.out.println("Average: " + avgSepalLength);
        System.out.println("Standard Deviation: " + stdSepalLength);
        System.out.println();

        System.out.println("Sepal Width");
        System.out.println("Min: " + minSepalWidth);
        System.out.println("Max: " + maxSepalWidth);
        System.out.println("Average: " + avgSepalWidth);
        System.out.println("Standard Deviation: " + stdSepalWidth);
        System.out.println();

        System.out.println("Petal Length");
        System.out.println("Min: " + minPetalLength);
        System.out.println("Max: " + maxPetalLength);
        System.out.println("Average: " + avgPetalLength);
        System.out.println("Standard Deviation: " + stdPetalLength);
        System.out.println();

        System.out.println("Petal Width");
        System.out.println("Min: " + minPetalWidth);
        System.out.println("Max: " + maxPetalWidth);
        System.out.println("Average: " + avgPetalWidth);
        System.out.println("Standard Deviation: " + stdPetalWidth);
        System.out.println();

    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double avg(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double std(double[] array) {
        double avg = avg(array);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i] - avg, 2);
        }
        return Math.sqrt(sum / (array.length - 1));
    }

}