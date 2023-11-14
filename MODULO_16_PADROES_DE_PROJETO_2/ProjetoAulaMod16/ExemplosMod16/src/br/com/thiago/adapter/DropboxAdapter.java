package br.com.thiago.adapter;

import java.io.File;

public class DropboxAdapter implements PersistenciaArquivos {
    private Dropbox dropbox;

    public DropboxAdapter(Dropbox dropbox) {
        this.dropbox = dropbox;
    }


    @Override
    public void gravar(File file) {
    dropbox.dowload(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        DropBoxFile file = dropbox.dowload((caminho));
        return new File(file.getLocalPath());
    }
}
