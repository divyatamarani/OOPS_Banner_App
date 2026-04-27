/**
 * OOPSBannerApp UC5 – Banner using Inline Array Initialization
 *
 * Prints "OOPS" using inline array + loop.
 *
 * @author Divya
 * @version 5.0
 * OOPSBannerApp UC7 – Banner using Class & OOPS Concepts
 *
 * Demonstrates encapsulation using inner class for character patterns.
 *
 * @author Divya
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner static class to store character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method to get pattern for O
    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
    }

    // Utility method to get pattern for P
    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });
    }

    // Utility method to get pattern for S
    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });
    }

    public static void main(String[] args) {

        // Inline array initialization
        String[] lines = {
            String.join(" ", " *** ", " *** ", " **** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", "**** ", " **** "),
            String.join(" ", "*   *", "*   *", "*    ", "     *"),
            String.join(" ", "*   *", "*   *", "*    ", "*    *"),
            String.join(" ", " *** ", " *** ", "*    ", " **** ")
        };

        // Loop to print
        for (String line : lines) {
            System.out.println(line);

        // Array of objects
        CharacterPattern[] patterns = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        // Loop through each row (7 rows)
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character
            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
}