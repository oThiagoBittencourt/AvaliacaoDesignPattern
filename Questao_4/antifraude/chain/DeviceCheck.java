package antifraude.chain;

import antifraude.model.Transaction;

public class DeviceCheck extends FraudCheck {

    @Override
    protected boolean performCheck(Transaction tx) {
        return !tx.dispositivo.equals("Desconhecido");
    }
}
