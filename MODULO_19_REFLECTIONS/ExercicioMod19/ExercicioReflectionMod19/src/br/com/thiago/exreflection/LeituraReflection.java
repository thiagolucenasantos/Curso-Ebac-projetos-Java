package br.com.thiago.exreflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class LeituraReflection {
    public static void main(String[] args) {
        System.out.println("***Imprimindo nome da Classe no console e valores da notattion");
        Class leituraClasse = Tabela.class;
        Annotation[] anotacoes = leituraClasse.getAnnotations();
        System.out.println(leituraClasse);
        System.out.println(Arrays.toString(anotacoes));

        System.out.println("\n***Lendo Construtor da Classe Tabela e fazendo nova instancia ***");
            try {
              Constructor cons = leituraClasse.getConstructor();
                Tabela tabela = (Tabela) cons.newInstance();
                System.out.println(cons);
                System.out.println(tabela);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
    }
    }

