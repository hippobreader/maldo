import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class SortDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dates: ");
        int n = scanner.nextInt();

        String[] dates = new String[n];

        System.out.println("Enter the dates in YYYY-MM-DD format:");
        for (int i = 0; i < n; i++) {
            dates[i] = scanner.next();
        }

       
        Arrays.sort(dates, (date1, date2) -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date d1 = sdf.parse(date1);
                Date d2 = sdf.parse(date2);
                return d1.compareTo(d2);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        });

       
        System.out.print("Sorted array: ");
        for (String date : dates) {
            System.out.print("\"" + date + "\", ");
        }
        System.out.println();
    }
}