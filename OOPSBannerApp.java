import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Banner using HashMap
 *
 * Demonstrates use of Map for storing character patterns.
 */
public class OOPSBannerApp {

    // Method to create pattern map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        // O pattern
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // P pattern
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        // S pattern
        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return map;
    }

    // Method to print banner
    public static void printBanner(String word, Map<Character, String[]> map) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String word = "OOPS";

        printBanner(word, patternMap);
    }
}