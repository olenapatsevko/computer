package computer.view;

import computer.utility.ScanUtil;
import lombok.Data;

@Data
public class View {


    public View() {
    }

    public String inputString(String s) {
        print(s);
        return ScanUtil.scanString();
    }

    public double inputDouble(String s) {
        print(s);
        return ScanUtil.scanDouble();
    }

    public int inputInt(String s) {
        print(s);
        return ScanUtil.scanInt();
    }

    public void print(String s) {
        System.out.println(s);
    }


}
