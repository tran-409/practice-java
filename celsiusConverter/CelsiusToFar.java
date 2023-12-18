package celsiusConverter;
import java.util.Scanner;

public class CelsiusToFar {

        //Method returns celsius into fahreinheit
    public static double celsiustofahrenheit (double cels) {
        return (9.0/5.0) * cels + 32;
    }

    public static void main(String[] args) {
        double celsius;
        Scanner scan = new Scanner(System.in);
        //System input
        System.out.print("Please input the temperature in Celsius: ");
        celsius = scan.nextDouble();
    
         
                double fahrenheit = celsiustofahrenheit(celsius);

        //Outputs fahrenheit
        System.out.println("Celsius:" + celsius + "\n" +
        		"Fahrenheit:" + fahrenheit);
          
       
    }
}