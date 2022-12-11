package additionally;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("C:\\полина\\test.txt");
        System.out.println(getSalesMap(reader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        try (Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNextLine()) {
                StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
                String line = stringBuilder.substring(0, stringBuilder.indexOf(" "));
                Long number = new Scanner(stringBuilder.substring(stringBuilder.indexOf(" ") + 1)).nextLong();
                System.out.println(line);
                System.out.println(number);
                if (!map.containsKey(line)) {
                    map.put(line, number);
                } else {
                    map.replace(line, map.get(line), number);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }return map;
    }
}
