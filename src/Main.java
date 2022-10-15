import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {
    public static void main(String[] args) {
        Integer [] numbers = {3, 6, 10, 2, 4, 6};
        System.out.println(range(numbers));
        min_two_numbers(numbers);
        math_expression(5.0, 10.0);
    }

    public static int range (Integer[] numbers){
        int min = MAX_VALUE;
        int max = MIN_VALUE;
        if (numbers.length == 1){
            return numbers[0];
        }else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        return (max - min);
    }

    public static void min_two_numbers(Integer[] numbers){
        int min = MAX_VALUE;
        int second_min = min;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                second_min = min;
                min = numbers[i];
            }
        }
        System.out.println("MIN_NUM: " + min + ", SECOND_MIN: " + second_min);
    }

    public static void math_expression(double x, double y){
        double res;

        res = Math.pow(x, 2) + Math.pow((((4 * y) / 5) - x), 2);
        System.out.println(res);
    }
}
