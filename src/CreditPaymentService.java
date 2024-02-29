public class CreditPaymentService {
    public int calculate(double amount, double percent, double time) {

        double monthlyPercent = percent / 12 / 100;
        double coefficient = (monthlyPercent * (Math.pow(1 + monthlyPercent, time))) / (Math.pow(1 + monthlyPercent, time) - 1);
        double result = coefficient * amount;

        return (int) result;


    }
}
