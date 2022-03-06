package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.OperatingSystem;
import com.company.devices.Phone;

import java.util.*;

import static com.company.Country.*;

public class Main {

    public static void main(String[] args) {

        //task 2
        System.out.println("-------Task 2-------");
        Animal dog = new Animal("dog", FoodType.ALL,10.0);
        dog.feed(8.0,FoodType.ALL);


        //task 3
        System.out.println("-------Task 3-------");
        System.out.println(POLAND.getGDPinPLN()+ "M");

        // task 4
        System.out.println("-------Task 4-------");
        Map<Country, Double> countryMap = new HashMap<>();

        countryMap.put(POLAND,58500000.0);
        countryMap.put(NORWAY,5367580.0);
        countryMap.put(CANADA,31612895.0);
        countryMap.put(GERMANY,83019200.0);
        countryMap.put(ITALY,60483973.0);

        Double maxValue = Collections.max(countryMap.values());
        for (Map.Entry<Country, Double> entry : countryMap.entrySet()) {
            if (entry.getValue()==maxValue) {
                System.out.println("Largest: "+entry.getKey());
            }
        }
        Double minValue = Collections.min(countryMap.values());
        for (Map.Entry<Country, Double> entry : countryMap.entrySet()) {
            if (entry.getValue()==minValue) {
                System.out.println("Smallest: "+entry.getKey());
            }
        }


        //task 5
        System.out.println("-------Task 5-------");
        Map<String,Country> mapCountries = new HashMap<>();
        mapCountries.put("Warsaw",POLAND);
        mapCountries.put("Oslo",NORWAY);
        mapCountries.put("Roma",ITALY);
        mapCountries.put("Ottawa",CANADA);
        mapCountries.put("Berlin",GERMANY);

        System.out.println("Not sorted: "+ mapCountries.keySet());

        Map<String,Country> sortedMap = new TreeMap<>(mapCountries);

        System.out.println("Sorted: "+sortedMap.keySet());

        //task 6

        System.out.println("-------Task 6-------");

        Car mustang = new Car("Ford","Mustang");
        Car fiesta = new Car("Ford","Fiesta");
        Phone siemensPhone1 = new Phone("Siemens","a57",9.0,OperatingSystem.Android);
        Phone siemensPhone2 = new Phone("Siemens","fridge-55",8.2,OperatingSystem.Android);

        List<Device> devicesFord = new ArrayList<>();
        devicesFord.add(mustang);
        devicesFord.add(fiesta);


        List<Device> devicesSiemens = new ArrayList<>();
        devicesSiemens.add(siemensPhone1);
        devicesSiemens.add(siemensPhone2);

        Map<String,List> devicesMap = new HashMap<>();
        devicesMap.put("Siemens",devicesSiemens);
        devicesMap.put("Ford",devicesFord);

        System.out.println(devicesMap.get("Siemens"));
        System.out.println(devicesMap.get("Ford"));

        //task 8, 11

        System.out.println("-------Task 8 and Task 11-------");

        List<Animal> animals = new ArrayList<>();
        animals.add(new Pets("dog",FoodType.ALL,10.0));
        animals.add(new Human(2000.0));
        animals.add(new FarmAnimals("pig",FoodType.ALL,30.0));
        animals.add(new FarmAnimals("chicken",FoodType.CROPS,4.0));
        animals.add(new Pets("cat",FoodType.ALL,2.0));
        animals.add(new Animal("lion",FoodType.MEAT,40.0));



        animals.sort((animal1, animal2)-> animal2.weight.compareTo(animal1.weight));

        for(int i=0;i < animals.size(); i++){
            System.out.println(animals.get(i).species+" "+animals.get(i).weight);
        }

    }
}
