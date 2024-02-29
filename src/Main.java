public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        double percent = 9.99;
        double time = 12;

        int pay = service.calculate(1_000_000, 9.99, 12);      //должно получиться 28

        System.out.println("Ежемесячный платеж: " + pay);

        System.out.println();
        System.out.println("сумма 1_000_000 руб / % 9,99 / срок 24 месяца");
        System.out.println(service.calculate(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("сумма 1_000_000 руб / % 9,99 / срок 36 месяца");
        System.out.println(service.calculate(1_000_000, 9.99, 36));


    }

}