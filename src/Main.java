
import exercicio02.ContaBancaria;
import exercicio02.OperacoesConta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        FormaGeometrica forma = new Circulo(4);

//        Exibivel produto1 = new Produto("notebook", 3000.0, "eletronico");
//
//        produto1.exibirDetalhes();


        OperacoesConta conta1 = new ContaBancaria("1199902389",3000.0);

        conta1.depositar(200);
        conta1.sacar(3000);

        System.out.println(conta1.ConsultarSaldo());

        conta1.exibirDados();

        OperacoesConta conta2 = new ContaBancaria("1122234656", 1000.0);



        conta1.transferir((ContaBancaria) conta2, 200);
        conta2.exibirDados();


    }
}