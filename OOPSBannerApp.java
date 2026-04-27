/**
 * OOPSBannerApp UC5 – Banner using Inline Array Initialization
 *
 * Prints "OOPS" using inline array + loop.
 *
 * @author Divya
 * @version 5.0
 */
public class OOPSBannerApp {

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
        }
    }
}