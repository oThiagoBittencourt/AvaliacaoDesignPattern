package antifraude.chain;

import antifraude.model.Transaction;

public class SuspiciousValueCheck extends FraudCheck {

    @Override
    protected boolean performCheck(Transaction tx) {
        return tx.valor <= 10000;
    }
}
