package ex.operator;

public class Problem1 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;
        double dbSum = val1 + val2 + val3;
        double dbAverage = dbSum / 3;

        System.out.println("dbSum = " + dbSum);
        System.out.println("dbAverage = " + dbAverage);

        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println("result = " + result);
    }

}
