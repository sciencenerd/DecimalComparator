import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175)); //return true since equal to 3 decimal places
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176)); //return false since not equal to 3 decimal places
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0)); //return true since equal to 3 decimal places
    }


    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        firstValue = (int)(firstValue *1000);
        secondValue = (int)(secondValue *1000);
        if (firstValue == secondValue) {
            System.out.println(firstValue);
            System.out.println(secondValue);
            return true;
        } else {
            System.out.println(firstValue);
            System.out.println(secondValue);
            return false;
        }
    }
}
