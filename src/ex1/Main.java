package ex1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);

        //Ex1
        BirthYearCalculator calculator = new BirthYearCalculator();
        try {
            int birthYear = calculator.calculateBirthYear(25);
            System.out.println("Birth Year: " + birthYear);
        } catch (ExceptionAge e) {
            System.out.println(e.getMessage());
        }

        //Ex2
        System.out.println("Whats your age?");
        Integer age = question.nextInt();
        try {
            int birthYear = calculator.calculateBirthYear(age);
            System.out.println("Birth Year: "+birthYear);
        } catch (ExceptionAge e){
            System.out.println("Age "+ age + " is invalid.");
        } catch (Exception e){
            System.out.println("Age not valid18");
        }


    }
}
