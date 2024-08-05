
public class Main {
    public static void main(String[] args) {

        System.out.print("Введите сумму пополнения:");
        double amount = 1100; // суммы пополнения и тп

        if (amount > 1000) {

            int fullHandreds = (int) Math.floor(amount / 100);
            double bonus = fullHandreds * 1;

            double totalAmount = amount + bonus;

            System.out.println("Итоговая сумма на счету клиента:" + totalAmount + "рублей");
            System.out.println("Количество бонусных рублей:" + bonus + "рублей");
        } else {
            System.out.println("Бoнусов нет");
            System.out.println("Итоговая сумма по счету клиента:" + amount + "рублей");

        }
    }
}