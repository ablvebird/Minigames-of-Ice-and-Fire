package toolkit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVScribe {
    public static List<String> readCSV(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line != null) {
                lines.addAll(Arrays.asList(line.split(":")));
                return lines;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}