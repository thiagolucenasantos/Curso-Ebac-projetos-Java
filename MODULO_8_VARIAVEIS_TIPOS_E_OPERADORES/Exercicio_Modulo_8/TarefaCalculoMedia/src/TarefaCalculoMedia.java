public class TarefaCalculoMedia {
    public static void main(String[] args) {
        tarefaMedia();
    }

    private static void tarefaMedia() {
        int nota1 = 5;
        int nota2 = 10;
        int nota3 = 5;
        int nota4 = 5;

        int somaNotas = nota1 + nota2 + nota3 + nota4;
        int media = somaNotas / 4;
        System.out.println(media);
    }
}
