package ex1;

import java.time.Year;

public class BirthYearCalculator {
    private final int currentYear;

    public BirthYearCalculator() {
        this.currentYear = Year.now().getValue();
    }

    public Integer calculateBirthYear(Integer age) throws ExceptionAge {
        if (age < 0 || age > 120) {
            throw new ExceptionAge("Age must be between 0 and 120.");
        } else {
            return currentYear - age;
        }
    }
}
