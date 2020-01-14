package ClientsBank;

public class InndividualEntrepreneur extends Client {

    public void giveMoney(double money) {
        if (money < 1000) {
            allCount = allCount - (money / 100) + money;
            System.out.println("Вы пополнили счет на сумму - " + formatter.format(money) + " Дополнительно была списана" +
                    "комиссия " + formatter.format((money / 100)));
        } else {
            allCount = allCount - (money / 200) + money;
            System.out.println("Вы пополнили счет на сумму - " + formatter.format(money) + " Дополнительно была списана" +
                    " комиссия " + formatter.format((money / 200)));
        }
    }
    public void takeMoney(double money) {
        if (allCount - money <= allCount) {
            allCount = allCount - money;
            System.out.println("Вы сняли со счета - " + formatter.format(money));
        } else {
            System.out.println("Недостаточно средств для снятия");
        }
    }
}
