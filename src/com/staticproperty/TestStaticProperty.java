package com.staticproperty;

public class TestStaticProperty {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Mazda 3");
        car1.setEngine("Skyactiv 3");
        System.out.println(car1.toString());
        System.out.println(car1.numberOfCars);

        Car car2 = new Car();
        car2.setName("Mazda 6");
        car2.setEngine("Skyactiv 6");
        System.out.println(car2.toString());
        System.out.println(car2.numberOfCars);
    }
}
