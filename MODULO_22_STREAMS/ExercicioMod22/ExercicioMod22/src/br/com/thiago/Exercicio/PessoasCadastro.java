package br.com.thiago.Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PessoasCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoa = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome e genero, separados por ' - 'ou digite 'SAIR' para encerrar");
            String entrada = scanner.nextLine().trim();

            if ("Sair".equalsIgnoreCase(entrada)) {

                break;

            }

            String[] partes = entrada.split("-");

            if (partes.length == 2) {

                String nome = partes[0].trim().toUpperCase();

                String genero = partes[1].trim().toUpperCase();
                if ("F".equalsIgnoreCase(genero) || "M".equalsIgnoreCase(genero)) {
                    pessoa.add(new Pessoa(nome, genero));
                    System.out.println(pessoa);
                } else {
                    System.out.println("Por favor digite 'M' para másculino e 'F' para feminino.");
                }
            }else {

                System.out.println("Formato inválido! Por favor, insira no formato 'Nome - Gênero(M/F)'.");
            }
        }


        System.out.println("***LISTA FILTRANDO UTILIZANDO STREAM E EXPRESSÃO LAMBDA");
        List<Pessoa> listaGenero = pessoa.stream()
                .filter(pessoaGenero -> pessoaGenero.getGenero().equalsIgnoreCase("F"))
                .collect(Collectors.toList());
        listaGenero.forEach(System.out::println);
    }
}
