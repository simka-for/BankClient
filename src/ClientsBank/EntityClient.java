package ClientsBank;

public class EntityClient extends Client {

    public void giveMoney(double money){
        allCount = allCount + money;
        System.out.println("Вы пополнили счет на сумму - " + formatter.format(money));
    }
    public void takeMoney(double money){
        if (allCount - (money/100) - money >= 0){
            allCount = allCount - (money/100) - money;
            System.out.println("Вы вывели со счета: " + formatter.format(money) + ", дополнительно была списана комиссия - " + (money/100));
        }else{
            System.out.println("Недостаточно средств для снятия");
        }
    }
}
