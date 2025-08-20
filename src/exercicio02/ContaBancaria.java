package exercicio02;

public class ContaBancaria implements OperacoesConta{
    private String numeroConta;
    private  double saldo;




    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if( valor > saldo){
            System.out.println("ERRO");
        } else {
            saldo-= valor;
        }




    }

    @Override
    public double ConsultarSaldo() {
        return saldo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldo);
    }


}
