package corp.logging;

public class MainApp {
    public static void main(String[] args) {

        LoggerSingleton logger = LoggerSingleton.getInstance();

        logger.logEvent("Sistema iniciado");
        logger.logAudit("Usuário admin acessou painel");
        logger.logError("Falha ao conectar ao banco");

        // Teste em multithread
        Runnable task = () -> {
            LoggerSingleton log = LoggerSingleton.getInstance();
            log.logEvent("Thread executando logging");
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
