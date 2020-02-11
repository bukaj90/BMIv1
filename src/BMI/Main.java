package BMI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
        double height, weight, BMI, newh;

            Scanner kb = new Scanner(System.in);
            System.out.println("Enter your height in cm: ");
            height = kb.nextDouble();
            System.out.println("Enter your weight in kg:");
            weight = kb.nextDouble();

            newh = height / 100;
            BMI = weight / (newh * newh);

            System.out.printf("Your BMI : %.2f", BMI);
            System.out.println();
            System.out.println("We analysis your BMI ");

            if (BMI < 18.5) {
                System.out.println("You have underweight.");
            } else if (BMI >= 18.5 && BMI < 24.9) {
                System.out.println("You have normal weight.");
            } else if (BMI > 25.0 && BMI < 29.9) {
                System.out.println("You have overweight.");
            } else if (BMI > 30.0) {
                System.out.println("You have obesity.");
            }
        }catch (Exception a){
            System.out.println("Something went wrong.");
        }


    }
}
