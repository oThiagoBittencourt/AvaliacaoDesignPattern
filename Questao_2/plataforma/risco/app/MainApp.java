package plataforma.risco.app;

import plataforma.risco.service.RiskCalculator;
import plataforma.risco.strategy.*;

public class MainApp {
    public static void main(String[] args) {

        RiskCalculator calculator = new RiskCalculator(new ConservativeRiskStrategy());

        System.out.println("Perfil conservador: " +
                calculator.calculate(8000, 50000, 45));

        calculator.setStrategy(new ModerateRiskStrategy());
        System.out.println("Perfil moderado: " +
                calculator.calculate(8000, 50000, 45));

        calculator.setStrategy(new AggressiveRiskStrategy());
        System.out.println("Perfil agressivo: " +
                calculator.calculate(8000, 50000, 45));
    }
}
