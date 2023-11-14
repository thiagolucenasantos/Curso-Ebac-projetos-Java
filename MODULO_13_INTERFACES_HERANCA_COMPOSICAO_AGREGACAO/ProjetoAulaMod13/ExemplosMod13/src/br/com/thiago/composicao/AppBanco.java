package br.com.thiago.composicao;

/**
 * Exemplo de composição, Banco objeto principal -> conta corrente e poupança existem por conta do banco
 */

public class AppBanco {
    public static void main(String[] args) {
        //instanciando o método
        Banco banco = new Banco();
        banco.setNome("Bank Thiago");
        banco.setCodigo(14L);

        //instanciando o método
        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(53000.00d);
        cc.setChequeEspecial(25000.00d);


        //instanciando o método
        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(800000.00d);


    }

}
