package corp.logging;

public class LoggerSingleton {

    // Construtor privado impede criação direta
    private LoggerSingleton() {}

    // Holder interno garante:
    // - instância única
    // - inicialização lazy
    // - thread-safe sem sincronização explícita
    private static class Holder {
        private static final LoggerSingleton INSTANCE = new LoggerSingleton();
    }

    public static LoggerSingleton getInstance() {
        return Holder.INSTANCE;
    }

    // Métodos dummy de log
    public synchronized void logToFile(String mensagem) {
        System.out.println("[ARQUIVO] " + mensagem);
    }

    public synchronized void logToServer(String mensagem) {
        System.out.println("[SERVIDOR] " + mensagem);
    }

    public synchronized void logError(String erro) {
        logToFile("Erro: " + erro);
        logToServer("Erro: " + erro);
    }

    public synchronized void logEvent(String evento) {
        logToFile("Evento: " + evento);
    }

    public synchronized void logAudit(String auditoria) {
        logToServer("Auditoria: " + auditoria);
    }
}
