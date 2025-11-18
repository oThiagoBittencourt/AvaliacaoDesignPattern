package plataforma.risco.strategy;

public interface RiskStrategy {
    double calculateRiskScore(double renda, double patrimonio, double idade);
}
