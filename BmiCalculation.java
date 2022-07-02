import java.util.Scanner;

public class BmiCalculation {

    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your height: ");
        height=scan.nextDouble();

        System.out.print("Please enter your weight: ");
        weight=scan.nextDouble();

        bmi= weight/height*height;

        System.out.println("Your body mass index is: "+bmi);


    }
}
