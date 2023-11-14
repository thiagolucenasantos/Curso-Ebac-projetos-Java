package br.com.thiago.adapter;

import java.io.File;

public interface PersistenciaArquivos {
    public void gravar(File file);
    public File ler(String caminho);//receber o caminho da leitura
}
