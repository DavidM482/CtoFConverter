import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        String celsius = "Celsius";
        String fahrenheit = "Fahrenheit";
        double celsiusTemp = 0;
        double fahrenheitTemp;
        boolean valid = false;
        // F = C 9 / 5 + 32

        do {
            System.out.println("Enter a value in celsius to be converted to fahrenheit: ");
            if (scan.hasNextDouble()) {
                celsiusTemp = scan.nextDouble();//-273.15
                scan.nextLine();
                if (celsiusTemp >= -273.15) {
                    valid = true;
                } else {
                    System.out.println("That is an invalid temperature. Please try again.");
                }
            }
        } while (!valid);
        fahrenheitTemp = celsiusTemp * 9 / 5 + 32;
        System.out.printf("%-1s : %6.2f", celsius, celsiusTemp);
        System.out.printf("\n%-1s : %6.2f", fahrenheit, fahrenheitTemp);
    }
}