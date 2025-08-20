import exercicio01.Exibivel;
import exercicio01.Produto;
import exercicio02.ContaBancaria;
import exercicio02.OperacoesConta;
import formas.Circulo;
import formas.FormaGeometrica;
import formas.Quadrado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        FormaGeometrica forma = new Circulo(4);

//        Exibivel produto1 = new Produto("notebook", 3000.0, "eletronico");
//
//        produto1.exibirDetalhes();


        OperacoesConta conta1 = new ContaBancaria("1199902389",3000.0);

        conta1.depositar(500);
        conta1.sacar(2700);
        System.out.println(conta1.ConsultarSaldo());

        conta1.exibirDados();


    }
}