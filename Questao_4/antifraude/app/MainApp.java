package antifraude.app;

import antifraude.chain.*;
import antifraude.model.Transaction;

public class MainApp {
    public static void main(String[] args) {

        FraudCheck chain = new SuspiciousValueCheck();
        chain.linkWith(new GeoLocationCheck())
             .linkWith(new UserHistoryCheck())
             .linkWith(new DeviceCheck());

        Transaction tx = new Transaction(
            12000,            // valor
            "Brasil",         // localização
            0,                // histórico bom
            "iPhone 12"       // dispositivo
        );

        boolean aprovado = chain.check(tx);

        System.out.println("Transação aprovada? " + aprovado);
    }
}
