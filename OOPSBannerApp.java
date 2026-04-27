/**
 * OOPSBannerApp UC6 – Banner using Methods (OOPS)
 *
 * Demonstrates modular design using methods.
 *
 * @author Divya
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method for O
    public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Method for P
    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Method for S
    public static String[] getSPattern() {
        return new String[]{
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        // Get patterns
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Print OOPS
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }
    }
}