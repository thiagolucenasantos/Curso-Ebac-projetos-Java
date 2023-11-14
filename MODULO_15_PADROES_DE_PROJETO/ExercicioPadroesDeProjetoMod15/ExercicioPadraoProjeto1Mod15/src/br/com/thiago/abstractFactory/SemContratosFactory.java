package br.com.thiago.abstractFactory;

public class SemContratosFactory extends Factory{

    @Override
    Car retrieveCar(String requestedGrade) {
         if ("A".equals(requestedGrade)) {
            return new FuscaCar(50, "Cheio", "Verde");
        } else {
            return null;
        }
    }
}
