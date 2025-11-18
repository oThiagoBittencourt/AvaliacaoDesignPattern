package plataforma.risco.strategy;

public class ConservativeRiskStrategy implements RiskStrategy {

    @Override
    public double calculateRiskScore(double renda, double patrimonio, double idade) {
        return (renda * 0.3) + (patrimonio * 0.4) - (idade * 0.3);
    }
}
