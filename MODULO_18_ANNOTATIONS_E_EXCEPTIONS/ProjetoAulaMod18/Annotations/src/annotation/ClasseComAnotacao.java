package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@PrimeiraAnotacao(value = "Thiago", bairros = {"Vila Ema"}, numeroCasa = 29L,valores = 40d)
public class ClasseComAnotacao {
    @PrimeiraAnotacao(value = "Pires", bairros = {"Teste"}, numeroCasa = 30L)
    private String nome;
}
