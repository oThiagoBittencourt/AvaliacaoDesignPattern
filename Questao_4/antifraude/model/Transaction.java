package antifraude.model;

public class Transaction {

    public double valor;
    public String localizacao;
    public int historicoRisco; // 0 = bom, 1 = ruim
    public String dispositivo;

    public Transaction(double valor, String localizacao, int historicoRisco, String dispositivo) {
        this.valor = valor;
        this.localizacao = localizacao;
        this.historicoRisco = historicoRisco;
        this.dispositivo = dispositivo;
    }
}
