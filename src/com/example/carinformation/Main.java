package com.example.carinformation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Golf", "VW", 2019, 20000, "blue", 10);
        System.out.println("We have cars:");
        System.out.println(car.toString());
        System.out.println();
        System.out.println("We sell 1 car");
        car.sell();
        System.out.println();
        System.out.println("Fields:");
        System.out.println("model = " + car.getModel());
        System.out.println("brand = " + car.getBrand());
        System.out.println("year = " + car.getYear());
        System.out.printf("price = %.2f%n", car.getPrice());
        System.out.println("color = " + car.getColor());
        System.out.println("qty = " + car.getQuantity());
        System.out.println();
        System.out.println("We change year and price");
        car.setYear(2020);
        car.setPrice(22000);
        System.out.println();
        System.out.println("Now we have cars:");
        System.out.println(car.toString());
    }
}
