package se.hkr.Task6;
interface Arithmetic{
    double operations(double a, double b);
}

public class DoubleParameters {

    public static void main(String[] args) {
        //17.6.1
        Arithmetic multiply = (a, b) -> a * b;
        System.out.println(multiply.operations(10.5, 5.5));
    }

}
