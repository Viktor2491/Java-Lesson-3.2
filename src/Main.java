public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 100;
        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100 * 1;
        } else {
            bonus = 0;
        }
        int finalbalance = balance + payment + bonus;
        System.out.println("Начислено бонусных рублей:");
        System.out.println(bonus);
        System.out.println("Итоговый баланс:");
        System.out.println(finalbalance);

    }
}
