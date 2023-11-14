package generics;

public class ClasseGenericaEntrada {
    public static void main(String[] args) {
        //instanciando e utilizando a clsse genérica
        ClasseGenerica<String> entrada = new ClasseGenerica<>("Teste");
        System.out.println(entrada.getData());

        ClasseGenerica<Long> entradaLong = new ClasseGenerica<>(10L);
        System.out.println(entradaLong.getData());
        }
    }



