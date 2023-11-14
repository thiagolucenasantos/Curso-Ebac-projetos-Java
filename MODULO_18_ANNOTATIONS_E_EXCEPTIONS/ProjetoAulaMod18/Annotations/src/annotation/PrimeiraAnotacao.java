package annotation;

//esse @ significa que criamos a anotação nessa interface, agora podemos utilizar
//em outras classes

import java.lang.annotation.*;

@Documented //para a documentação sair no javadoc quando gerar o arquivo
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})//podemos utilizar tanto na classe quanto internamente na classe
public @interface PrimeiraAnotacao {
    //criações de anotações obrigatórias
    //por regra só podemos utilizar classes primitivas
    String value();
    String[] bairros();
    long numeroCasa();

    //criação de obrigações não obrigatórias
    double valores() default 20d;

}
