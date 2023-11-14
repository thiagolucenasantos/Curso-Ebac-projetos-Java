package br.com.thiago;

import br.com.thiago.dao.CachorroMapDao;
import br.com.thiago.domain.Cachorro;

import javax.swing.*;

public class appCachorros {

    private static CachorroMapDao ICachorroDao;

    public static void main(String[] args) {

        ICachorroDao = new CachorroMapDao();

        String opcao = JOptionPane.showInputDialog("Digite 1 para cadastrar, 2 para consultar, 3 para alteração, 4 para exclusão, 5 para sair");

        //  String nome = JOptionPane.showInputDialog("Digite o nome");

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog("Opção inválida!! Digite 1 para cadastrar, 2 para consultar, 3 para alteração, 4 para exclusão, 5 para sair ");
        }
        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {//codigo 1
                String dados = JOptionPane.showInputDialog("Digite os dados separados por vírgula, conforme exemplo: Código,Nome, raça");

                cadastrar(dados);
            }else if (isConsultar(opcao)){//codigo 2
                String dados = JOptionPane.showInputDialog("Digiteo o nome do cachorro");
                
                consultar(dados);
            }else if(isExcluir(opcao)){//codigo 4
                String dados = JOptionPane.showInputDialog("Digite o nome do animal");

                excluir(dados);
            }else{ //codigo 3
                String dados = JOptionPane.showInputDialog(null, "Digite os dados para atualização, Código, Nome, Raça");
                atualizar(dados);
            }
            opcao = JOptionPane.showInputDialog("Digite 1 para cadastrar, 2 para consultar, 3 para alteração, 4 para exclusão, 5 para sair ");

        }

    }

    private static void atualizar(String dados) {
        String[] campos = dados.split(",");
        Cachorro cachorro = new Cachorro(campos[0], campos[1], campos[2]);
        ICachorroDao.alterar(cachorro);
        }


    private static void excluir(String dados) {
        ICachorroDao.excluir((dados));
        JOptionPane.showMessageDialog(null, "Cachorro Excluido!!");
    }

    private static boolean isExcluir(String opcao) {
        if ("4".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void consultar(String dados) {
        Cachorro cachorro = ICachorroDao.consultar((dados));
        if (cachorro != null){
            JOptionPane.showMessageDialog(null, "Cachorro encontrado" + cachorro.toString());
        }else {
            JOptionPane.showMessageDialog(null, "Cachorro não encontrado");
        }
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] campos = dados.split(",");
        if (campos.length != 3) {
            JOptionPane.showMessageDialog(null, "Você deve fornecer três campos: Código, Nome e Raça.");
            return; // Encerra o método se os campos não estiverem completos.
        }
        Cachorro cachorro = new Cachorro(campos[0], campos[1], campos[2]);
        Boolean isCadastrado = ICachorroDao.cadastrar(cachorro);
        if (Boolean.TRUE.equals(isCadastrado)) {
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
        }
        main(null);
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
        JOptionPane.showMessageDialog(null, "Obrigado!!");
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}


