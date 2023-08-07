import java.util.*;
public class Temperature{
    
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the temperature in Celsius : ");
            float c = sc.nextFloat();
            float f = c * (9.0f/5.0f) + 32;
            
            System.out.println("The temperature is "+f+" degree Fahrenheit.");
        }
        
    }
    
}