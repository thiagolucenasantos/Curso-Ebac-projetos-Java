package br.com.thiago.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {
    public static void main(String[] args) {
        System.out.println("***pegando a classe do produto e imprimindo***");
        Class classe = Produto.class;
        System.out.println(classe);

        System.out.println("***fazendo a mesma coisa de cima, porém de maneira diferente***");
        Produto prod = new Produto();//instanciando a classe produto
        Class classe1 = prod.getClass();//pegando a classe e adicionando dentro da variável classe1 a variável prod do instanciamento Produto
        System.out.println(classe1);

        System.out.println("***pegando o constructor na classe Produto, caso exista***");
        try {
            Constructor cons = classe.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();//criando um produto a partir do construtor da classe Produto de nome Produto via reflections
            System.out.println(cons);
            System.out.println(prod1);

            System.out.println("***pegando as propriedades da classe prod1***");
            Field[] fields = prod1.getClass().getDeclaredFields();
            for (Field field : fields){
                Class<?> type = field.getType();
                String name = field.getName();
                System.out.println(type);
                System.out.println(name);
            }

            System.out.println("***pegando array de métodos***");
            Method[] methods = prod1.getClass().getDeclaredMethods();
            for (Method m : methods){
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(nome);
                System.out.println(type);


                System.out.println("Executando os métodos");
                if (m.getName().startsWith("get")){
                    System.out.println(m.invoke(prod1));
                }else {
                    for (Class classesTypes : m.getParameterTypes()){
                        if (classesTypes.equals(String.class)){
                            System.out.println(m.invoke(prod1,"Thiago"));
                        } else if (classesTypes.equals(Long.class)) {
                            System.out.println(m.invoke(2l));
                        }else {
                            System.out.println(m.invoke(prod1, 2d));
                        }
                    }
                }
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
