public class CreditPaymentService {
    public int calculate(double a, double b, double c) {

        double monthlyPercent = b / 12 / 100;
        double coefficient = (monthlyPercent * (Math.pow(1 + monthlyPercent, c))) / (Math.pow(1 + monthlyPercent, c) - 1);
        double result = coefficient * a;

        return (int) result;


    }
}
