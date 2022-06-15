public class Main {
    public static void main(String[] args) {
        int balance = 100; // Первоначальный баланс
        int payment = 100; // Платеж
        int bonus; // Бонусные рубли
        if (payment > 1000) {
            bonus = payment / 100 * 1;
        } else {
            bonus = 0;
        }
        int finalbalance = balance + payment + bonus; // Итоговый баланс
        System.out.println("Начислено бонусных рублей:");
        System.out.println(bonus);
        System.out.println("Итоговый баланс:");
        System.out.println(finalbalance);

    }
}
