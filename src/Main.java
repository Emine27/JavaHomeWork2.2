public class Main<bonus> {
    public static void main(String[] args) {

        int amount = 100; // изначальная сумма на счету

        int replenishment = 1100;// сумма пополнения счета

        int oneBonus = 100; //столько нужно потратить, чтоб получить 1 бонусный рубль

        int bonus = replenishment > 1000 ? replenishment / oneBonus : 0;

        int finalAccount = amount + bonus + replenishment; //итоговая сумма на счету(с учетом бонусов)

        System.out.println("Ваш бонус составляет: " + bonus + ". Итоговая сумма на счету:" + finalAccount);
    }
}
