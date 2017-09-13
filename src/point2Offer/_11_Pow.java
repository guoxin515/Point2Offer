package point2Offer;

/**
 * Created by GX on 2017/8/7.
 */
public class _11_Pow {
    public static void main(String args[]) {
        System.out.println(Power(2, 0));
    }

    public static double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return pow(base, exponent);
        } else {
            return 1 / pow(base, -exponent);
        }
    }

    private static double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double result = pow(base, exponent >> 1);
        result *= result;
        if((exponent & 1) == 1){
            result *= base;
        }
        return result;
    }
}
