package computer.utility;

import computer.exceptions.InvalidDataException;

import java.util.Scanner;

public class ScanUtil {

    public static Scanner in = new Scanner(System.in);

    public static String scanString() {
        return in.nextLine();
    }

    public static int scanInt() {
        try {
            return Integer.parseInt(scanString());
        } catch (Exception e) {
            throw new InvalidDataException(" integer parsing failed ");
        }
    }

    public static double scanDouble() {
        try {
            return Double.parseDouble(scanString());
        } catch (Exception e) {
            throw new InvalidDataException("double parsing failed");
        }
    }


}
