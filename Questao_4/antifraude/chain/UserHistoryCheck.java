package antifraude.chain;

import antifraude.model.Transaction;

public class UserHistoryCheck extends FraudCheck {

    @Override
    protected boolean performCheck(Transaction tx) {
        return tx.historicoRisco == 0;
    }
}
