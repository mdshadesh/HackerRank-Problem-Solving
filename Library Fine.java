import static java.lang.System.out;
import java.util.Scanner;

public class WarmLibraryFine {

    public static void main(String x[]) {
        WarmLibraryFine o = new WarmLibraryFine();
        o.run();
    }

    void run() {
        try (final Scanner in = new Scanner(System.in, "ascii")) {

            final int fine;

            final int aday = in.nextInt();
            final int amon = in.nextInt();
            final int ayr = in.nextInt();

            final int eday = in.nextInt();
            final int emon = in.nextInt();
            final int eyr = in.nextInt();

            if (ayr < eyr) {
                fine = 0;
            } else if (ayr > eyr) {
                fine = 10_000;
            } else if (amon < emon) {
                fine = 0;
            } else if (amon > emon) {
                fine = 500 * (amon - emon);
            } else if (aday > eday) {
                fine = 15 * (aday - eday);
            } else {
                fine = 0;
            }
            out.println(fine);
        }
    }
}