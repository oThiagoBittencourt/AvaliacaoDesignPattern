package plataforma.risco.strategy;

public class ModerateRiskStrategy implements RiskStrategy {

    @Override
    public double calculateRiskScore(double renda, double patrimonio, double idade) {
        return (renda * 0.5) + (patrimonio * 0.3) - (idade * 0.2);
    }
}
