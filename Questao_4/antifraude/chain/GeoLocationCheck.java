package antifraude.chain;

import antifraude.model.Transaction;

public class GeoLocationCheck extends FraudCheck {

    @Override
    protected boolean performCheck(Transaction tx) {
        return !tx.localizacao.equals("Pais de Risco");
    }
}
