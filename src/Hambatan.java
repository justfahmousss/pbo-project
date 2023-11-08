import java.util.Scanner;

public abstract class Hambatan {
    protected double R1,R2, R3;
    Scanner io = new Scanner(System.in);

    protected abstract void inputDataR();
    protected abstract void tampilData();
}
