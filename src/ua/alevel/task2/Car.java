package ua.alevel.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Car {
    private String name;
    private String model;
    private int year;

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("audi","a3",1990));
        cars.add(new Car("audi","a3",1991));
        cars.add(new Car("audi","a3",1995));
        cars.add(new Car("audi","a4",2005));
        cars.add(new Car("audi","a7",1995));
        cars.add(new Car("audi","a7",2005));

        for (Car currentCar : cars){
            System.out.println(currentCar.toString());
        }
        System.out.println();


        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Car) o1).getYear() - ((Car) o2).getYear();
            }
        };
        cars.sort(comparator);

        for (Car currentCar : cars){
            System.out.println(currentCar.toString());
        }

    }

}
