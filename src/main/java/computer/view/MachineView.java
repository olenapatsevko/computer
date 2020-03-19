package computer.view;

public class MachineView extends View {

    private static final String INPUT = "input - ";

    @Override
    public String inputString(String s){
        print(INPUT+ s);
        return scanString();
    }



    @Override
    public double inputDouble(String s){
        print(INPUT+ s);
        return scanDouble();

    }

    @Override
    public int inputInt(String s){
        print(INPUT+ s);
        return scanInt();

    }


}
