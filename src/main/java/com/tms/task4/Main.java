/**
 * 4. Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */

package com.tms.task4;

import com.tms.task4.car.Cabriolet;
import com.tms.task4.car.Crossover;
import com.tms.task4.car.Minivan;
import com.tms.task4.car.Sedan;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Sedan toyotaCorolla = new Sedan("Toyota", "Corolla", "Black",
                2020, 118, 19600, true);
        Sedan volkswagenPolo = new Sedan("Volkswagen", "Polo", "Silver",
                2020, 198, 21090, false);
        Sedan skodaSuperb = new Sedan("Skoda", "Superb", "White",
                2021, 207, 49090, false);
        Cabriolet porscheCayman = new Cabriolet("Porsche", "718 Cayman", "Black",
                2016, 251, 59700, true);
        Cabriolet jaguarFType = new Cabriolet("Jaguar", "F-Type", "Blue",
                2022, 200, 69900, true);
        Crossover chevroletNiva = new Crossover("Chevrolet", "Niva", "Red",
                2019, 167, 32000, true);
        Minivan hondaElysion = new Minivan("Honda", "Elysion", "Silver",
                2007, 135, 25000, false);


        garage.parkTheCar(toyotaCorolla);
        garage.parkTheCar(volkswagenPolo);
        garage.parkTheCar(skodaSuperb);
        System.out.println("-------------------------");

        System.out.println(garage.getCarFleet());
        garage.parkTheCar(porscheCayman);
        garage.parkTheCar(jaguarFType);
        garage.leftTheGarage(toyotaCorolla);
        System.out.println("-------------------------");
        System.out.println(garage.getCarFleet());

        garage.leftTheGarage(jaguarFType);
        garage.parkTheCar(chevroletNiva);
        garage.parkTheCar(hondaElysion);
        System.out.println("-------------------------");
        System.out.println(garage.getCarFleet());
    }

}
