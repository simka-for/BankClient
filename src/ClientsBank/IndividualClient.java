package ClientsBank;

public class IndividualClient extends Client{

    public void giveMoney(double money){
        allCount = allCount + money;
        System.out.println("Вы пополнили счет на сумму - " + formatter.format(money));
    }
    public void takeMoney(double money){
        if (allCount - money <= allCount){
            allCount = allCount - money;
            System.out.println("Вы сняли со счета - " + formatter.format(money));
        }else{
            System.out.println("Недостаточно средств для снятия");
        }
    }
}
