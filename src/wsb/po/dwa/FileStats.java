package wsb.po.dwa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileStats {
    public static void main(String[] args) throws IOException {
        String filename = "_Python/dwa/stars.py"; // Podaj własną nazwę pliku
        List<String> lines = Files.readAllLines(Paths.get(filename));

        long wordCount = lines.stream().flatMap(line -> Arrays.stream(line.split("\\s+"))).count();
        long charCount = lines.stream().mapToLong(String::length).sum();

        System.out.println("Wiersze: " + lines.size());
        System.out.println("Słowa: " + wordCount);
        System.out.println("Znaki: " + charCount);
    }
}
