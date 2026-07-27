import java.time.LocalDateTime;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;
    private LocalDateTime agora = LocalDateTime.now();

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numeroConta = agora.getNano();


    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
