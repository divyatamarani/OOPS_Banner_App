/**
 * OOPSBannerApp UC3 – Banner Display using String.join()
 *
 * Prints "OOPS" banner using String.join() instead of + operator.
 *
 * @author Divya
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ", " *** ", " *** ", " **** ", " ***** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*   *", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "*   *", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", "**** ", " **** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*    ", "     *"));
        System.out.println(String.join(" ", "*   *", "*   *", "*    ", "*    *"));
        System.out.println(String.join(" ", " *** ", " *** ", "*    ", " **** "));

    }
}