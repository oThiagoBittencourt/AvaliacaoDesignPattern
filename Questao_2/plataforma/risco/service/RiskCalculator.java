package plataforma.risco.service;

import plataforma.risco.strategy.RiskStrategy;

public class RiskCalculator {

    private RiskStrategy strategy;

    public RiskCalculator(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double renda, double patrimonio, double idade) {
        return strategy.calculateRiskScore(renda, patrimonio, idade);
    }
}
