package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthday : ");

        String dateStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dClient = sdf.parse(dateStr);

        Date dMe = sdf.parse("14-09-1993");

        long client = dClient.getTime();
        long me = dMe.getTime();
        long diff = client-me;

//        long difference_In_Seconds
//                = (difference_In_Time
//                / 1000)
//                % 60;
//
//        long difference_In_Minutes
//                = (difference_In_Time
//                / (1000 * 60))
//                % 60;
//
//        long difference_In_Hours
//                = (difference_In_Time
//                / (1000 * 60 * 60))
//                % 24;
//
//        long difference_In_Years
//                = (difference_In_Time
//                / (1000l * 60 * 60 * 24 * 365));
//
//        long difference_In_Days
//                = (difference_In_Time
//                / (1000 * 60 * 60 * 24))
//                % 365;

        System.out.println(diff);
        System.out.println(diff/(1000 * 60 * 60 * 24)% 365);
    }
}