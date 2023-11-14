package br.com.thiago.abstractFactory;

public class ContratosFactory extends Factory {
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100, "Cheio", "Azul");
        } else {
            return new MercedesCar(500, "Cheio", "Vermelho");
        }
    }
}