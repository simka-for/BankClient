package ClientsBank;

import java.text.DecimalFormat;

public abstract class Client {

    protected double allCount;
    DecimalFormat formatter = new DecimalFormat("#0.0 руб");

    public abstract void giveMoney(double money);
    public abstract void takeMoney(double money);
    public void getCount() {
        System.out.println("Общая сумма на счету: " + formatter.format(allCount));
    }
}
