package br.com.thiago.domain;

import br.com.thiago.dao.ClienteMapDao;
import br.com.thiago.dao.IClienteDao;
import br.com.thiago.domain.Cliente;
import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.atomic.DoubleAdder;

public class App {
    private static IClienteDao iClienteDao;

    public static void main(String[] args) {
        iClienteDao = new ClienteMapDao();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, " +
                "4 para alteração ou 5 para sair", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            //atribuindo um novo valor a variável opcao nesse momento, caso o usuário cause erro de digitação
            opcao = JOptionPane.showInputDialog(null, "Opção Inválida: Digite 1 para cadastro, 2 para consultar, 3 para exclusão, " +
                    "4 para alteração ou 5 para sair", JOptionPane.INFORMATION_MESSAGE);
        }


        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula," +
                        "conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o cpf", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
                //***Faltou fazer as telas dos botões 3, 4 ***
            }else if(isExcluir(opcao)){
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF",JOptionPane.INFORMATION_MESSAGE);
                
                excluir(dados);
            }else{
                String dados = JOptionPane.showInputDialog(null, "Digite os dados separados por vírgula,Nome, CPF, Telefone, Endereço, Número, CIdade e Estado, Atualização ",JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }

            //caso o cpf não seja encontrado retorna a primeira tela inicial para escolha do número
             opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, " +
                    "4 para alteração ou 5 para sair", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        iClienteDao.alterar(cliente);

    }

    private static void excluir(String dados) {
        iClienteDao.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído");

    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)){
            return true;
        }
        return false;
    }

    public static void consultar(String dados) {
        //**Validar se foi passado somente o CPF
       Cliente cliente = iClienteDao.consultar(Long.parseLong(dados));//Convertendo String em Long
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ");
        }
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");//gerando um Array para alocar os dados digitados de cadastro
        //Tentar validar se todos os campos estão preenchidos.
        //Se não tiver, passar null no construtor onde o valor é nulo
        //Cliente cliente = new Cliente();
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean iscadastrado = iClienteDao.cadastrar(cliente);
        if (iscadastrado) {
            JOptionPane.showInputDialog(null, "Cliente cadastrado com sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showInputDialog(null, "Cliente já se enconta no cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showInputDialog(null, "Até logo!!", "sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); // método para parar o programa e fechar a interface
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
}
