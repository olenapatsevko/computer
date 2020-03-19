package computer.view;

import computer.exceptions.InvalidDataException;
import lombok.Data;

import java.util.Scanner;

@Data
public abstract class View {

    private final Scanner in = new Scanner(System.in);

    public abstract String inputString(String s);

    public abstract double inputDouble(String s);

    public abstract int inputInt(String s);

    public void print(String s) {
        System.out.println(s);
    }

    public String scanString() {
        return in.nextLine();
    }

    public int scanInt() {
        try {
            return Integer.parseInt(scanString());
        } catch (Exception e) {
            throw new InvalidDataException(" integer parsing failed ");
        }
    }

    public double scanDouble() {
        try {
            return Double.parseDouble(scanString());
        } catch (Exception e) {
            throw new InvalidDataException("double parsing failed");
        }
    }


}
