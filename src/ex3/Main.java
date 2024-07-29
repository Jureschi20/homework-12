package ex3;

public class Main {
    public static void main(String[] args) {
        IntTools intTools = new IntTools(12345);
        int digitalSumResult = intTools.digitalSum();
        int lastDigitResult = intTools.lastDigit();
        System.out.println("The digital sum of 12345 is: " + digitalSumResult);
        System.out.println("The last digit of 12345 is: " + lastDigitResult);

        try {
            int digitAtResult = intTools.digitAt(3);
            System.out.println("The position of digit 3 in 12345 is: " + digitAtResult);
        } catch (ExceptionDigit e) {
            System.err.println(e.getMessage());
        }

        try {
            int digitAtResult = intTools.digitAt(7);
            System.out.println("The position of digit 7 in 12345 is: " + digitAtResult);
        } catch (ExceptionDigit e) {
            System.err.println(e.getMessage());
        }
    }
}
