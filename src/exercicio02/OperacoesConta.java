package exercicio02;

public interface OperacoesConta {
    void depositar(double valor);
    void sacar(double valor);
    double ConsultarSaldo();
    void exibirDados();
    void transferir (ContaBancaria Destino ,double valor);



}
