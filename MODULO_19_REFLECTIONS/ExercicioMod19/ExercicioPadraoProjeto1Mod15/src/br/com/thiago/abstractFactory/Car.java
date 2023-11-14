package br.com.thiago.abstractFactory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;
    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }
    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + fuelSource + "engine has been started, and is ready " + horsePower);
    }
    public void clean(){
        System.out.println("Car has been cleaned, and the " + color.toLowerCase() + "color shines");
    }
    public void nechanicCheck(){
        System.out.println("Car has been checked by the mechanic");
    }
    public void fuelCar(){
        System.out.println("Car is beig " + fuelSource.toLowerCase());

    }

}
