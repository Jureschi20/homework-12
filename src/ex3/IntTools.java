package ex3;

public class IntTools {
    int value;

    public IntTools(int value) {
        this.value = value;
    }

    public int digitalSum() {
        int sum = 0;
        int digits = value;
        while (digits != 0) {
            sum += digits % 10;
            digits /= 10;
        }
        return sum;
    }

    public int lastDigit() {
        return Math.abs(value % 10);
    }

    public int digitAt(int number) throws ExceptionDigit {
        int digits = value;
        int position = 0;
        while (digits != 0) {
            if (Math.abs(digits % 10) == number) {
                return position;
            }
            digits /= 10;
            position++;
        }
        throw new ExceptionDigit("Digit " + number + " not found in " + value);
    }
}

