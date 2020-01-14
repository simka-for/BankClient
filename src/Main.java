import ClientsBank.*;

public class Main {
    public static void main(String[] args) {

        Client individualClient = new IndividualClient();
        Client enitytyClient = new EntityClient();
        Client inndividualEntrepreneur = new InndividualEntrepreneur();

        individualClient.getCount();
        individualClient.giveMoney(1000);
        individualClient.takeMoney(350);
        individualClient.getCount();
        System.out.println("\n");

        enitytyClient.giveMoney(500);
        enitytyClient.takeMoney(200);
        enitytyClient.getCount();
        System.out.println("\n");

        inndividualEntrepreneur.giveMoney(500);
        inndividualEntrepreneur.giveMoney(1500);
        inndividualEntrepreneur.getCount();
    }
}
