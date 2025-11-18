package antifraude.chain;

import antifraude.model.Transaction;

public abstract class FraudCheck {

    private FraudCheck next;

    public FraudCheck linkWith(FraudCheck next) {
        this.next = next;
        return next;
    }

    public boolean check(Transaction tx) {
        if (!performCheck(tx)) {
            System.out.println("Falha na verificação: " + this.getClass().getSimpleName());
            return false;
        }

        if (next == null) return true;

        return next.check(tx);
    }

    protected abstract boolean performCheck(Transaction tx);
}
