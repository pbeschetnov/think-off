import models.ApiResponse;
import utils.Fetcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printer = new PrintWriter(System.out, true);

        while (true) {
            try {
                printer.println("Enter from currency:");
                String from = scanner.readLine();
                if (from == null) {
                    return;
                }

                printer.println("Enter to currency:");
                String to = scanner.readLine();
                if (to == null) {
                    return;
                }

                from = from.toUpperCase().trim();
                to = to.toUpperCase().trim();

                ApiResponse response = Fetcher.fetchCurrency(from, to);

                if (response == null) {
                    printer.println("Sorry :( Your input is invalid\n");
                    continue;
                }

                printer.println(String.format(Locale.US, "Course for %s is", response.getDate()));
                printer.println(String.format(Locale.US, "%s 1.000 == %s %.3f\n", from, to, response.getRates().getValue()));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
