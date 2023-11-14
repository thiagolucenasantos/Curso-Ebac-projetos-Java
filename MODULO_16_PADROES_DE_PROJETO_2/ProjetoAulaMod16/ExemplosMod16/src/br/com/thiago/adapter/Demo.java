package br.com.thiago.adapter;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String file = "teste";
        Dropbox drop = new Dropbox();
        PersistenciaArquivos arquivos = new DropboxAdapter(drop); //aqui que entra o adaptador para utilizar a classe Dropbox
        arquivos.gravar(new File(file));

    }
}
