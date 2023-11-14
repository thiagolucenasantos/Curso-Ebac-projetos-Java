package br.com.thiago.SingletonPropriedadeThread;

public class SingletonPropriedadeThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }
        static class ThreadFoo implements Runnable {
        public void run(){
            //utilizando o método synchronized para garantir o recebimento de um unico valor
            SingletonPropriedadeThreadSincronizado singleton = SingletonPropriedadeThreadSincronizado.getInstance("Teste");
            System.out.println(singleton.getValue());
        }
    }


     static class ThreadBar implements Runnable {

        public void run(){
            SingletonPropriedadeThreadSincronizado singleton = SingletonPropriedadeThreadSincronizado.getInstance("Teste1");
            System.out.println(singleton.getValue());
        }

    }
}

