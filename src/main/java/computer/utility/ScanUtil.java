package computer.utility;

import computer.exceptions.InvalidDataException;

import java.util.Scanner;

public class ScanUtil {

    private static final Scanner in = new Scanner(System.in);

    private ScanUtil(){}

    public static String scanString() {
        return in.next();
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
