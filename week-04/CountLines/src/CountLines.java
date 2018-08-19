import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(countLines("bacon-ipsum.txt"));
    }

    private static int countLines(String path) {
        try {
            Path filePath = Paths.get(path);
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (Exception e) {
            return 0;
        }
    }
}
