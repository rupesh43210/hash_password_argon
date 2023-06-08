import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExampleClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emily");
        System.out.println(names);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("John", 85);
        scores.put("Emily", 92);
        System.out.println(scores);

        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        File file = new File("example.txt");
        try {
            boolean fileExists = file.createNewFile();
            System.out.println("File created: " + fileExists);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path filePath = file.toPath();
        try {
            long fileSize = Files.size(filePath);
            System.out.println("File size: " + fileSize + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "username", "password");
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
