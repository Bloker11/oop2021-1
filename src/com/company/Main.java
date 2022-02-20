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
        Animal dog = new Animal("dog", FoodType.ALL);
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
        Car oven = new Car("Siemens","a57");
        Car fridge = new Car("Siemens","fridge-55");

        List<Device> devicesFord = new ArrayList<>();
        devicesFord.add(mustang);
        devicesFord.add(fiesta);


        List<Device> devicesSiemens = new ArrayList<>();
        devicesSiemens.add(oven);
        devicesSiemens.add(fridge);

        Map<String,List> devicesMap = new HashMap<>();
        devicesMap.put("Siemens",devicesSiemens);
        devicesMap.put("Ford",devicesFord);

        System.out.println(devicesMap.get("Siemens"));
        System.out.println(devicesMap.get("Ford"));

    }
}
