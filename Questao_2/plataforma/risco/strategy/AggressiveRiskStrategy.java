package plataforma.risco.strategy;

public class AggressiveRiskStrategy implements RiskStrategy {

    @Override
    public double calculateRiskScore(double renda, double patrimonio, double idade) {
        return (renda * 0.7) + (patrimonio * 0.2) - (idade * 0.1);
    }
}
