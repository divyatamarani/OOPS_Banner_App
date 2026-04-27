/**
 * OOPSBannerApp UC4 – Banner using Array and Loop
 *
 * Prints "OOPS" using String array and loop.
 *
 * @author Divya
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create array
        String[] lines = new String[7];

        // Step 2: Fill array using String.join()
        lines[0] = String.join(" ", " *** ", " *** ", " **** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", "**** ", " **** ");
        lines[4] = String.join(" ", "*   *", "*   *", "*    ", "     *");
        lines[5] = String.join(" ", "*   *", "*   *", "*    ", "*    *");
        lines[6] = String.join(" ", " *** ", " *** ", "*    ", " **** ");

        // Step 3: Loop and print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}