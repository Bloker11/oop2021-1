package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.OperatingSystem;
import com.company.devices.Phone;

import java.util.*;

import static com.company.Country.*;

public class Main {

    public static void main(String[] args) throws Exception {

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

        //Task 7
        System.out.println("-------Task 7-------");
        Car ford = new Car("Ford","Fiesta");
        ford.startACar();

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

        //Task 9

      //    System.out.println("-------Task 9-------");
//        System.out.println("A");
//        RunnableClass runnableClass = new RunnableClass();
//
//        Thread firstThread = new Thread(runnableClass);
//        Thread secondThread = new Thread(runnableClass);
//
//        firstThread.start();
//        secondThread.start();

       // System.out.println("B");
        //9B

//        Thread scorpion = new Thread(new Scorpion());
//        Thread subZero = new Thread(new SubZero());
//        scorpion.start();
//        subZero.start();


       // 9C and 9D

//        System.out.println("C and D");
//        RunnableClass scorpion = new RunnableClass();
//        scorpion.finisher = ()-> System.out.println("Scorpion lights SubZero");
//
//        RunnableClass subZero = new RunnableClass();
//        subZero.finisher = ()-> System.out.println("SubZero froze Scorpions head");
//
//
//        Thread firstThread = new Thread(scorpion);
//        Thread secondThread = new Thread(subZero);
//        firstThread.start();
//        secondThread.start();

        //9E
//        System.out.println("E");
//        CallableClass callable = new CallableClass();
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
//        Future<Double> value;
//        try {
//            value = executor.submit(callable);
//            System.out.println(value.get());
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            executor.shutdown();
//        }
//
//        //9F
//        System.out.println("F");
//        CallableClass scorpionFinisher = new CallableClass();
//        scorpionFinisher.finisherList.add(() -> System.out.println("Scorpion lights SubZero"));
//        scorpionFinisher.finisherList.add(() -> System.out.println("Scorpion fatality"));
//
//
//        CallableClass subZeroFinisher = new CallableClass();
//        subZeroFinisher.finisherList.add(() -> System.out.println("SubZero froze Scorpions head"));
//        subZeroFinisher.finisherList.add(() -> System.out.println("SubZero fatality"));


//        try {
//            if (value.get() >= 0.5) {
//                scorpionFinisher.finisherList.get(new Random().nextInt(scorpionFinisher.finisherList.size())).finishHim();
//
//            } else {
//                subZeroFinisher.finisherList.get(new Random().nextInt(subZeroFinisher.finisherList.size())).finishHim();
//            }
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }

        //Task 10
        System.out.println("-------Task 10-------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(13);
        list1.add(15);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(133);
        list2.add(18);
        list2.add(19);
        list2.add(20);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(122);
        list3.add(183);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(116);
        list4.add(189);
        list4.add(2);


        long start;
        long end;
        long time;

        CallableSorter callableSorter1 = new CallableSorter(list1);
        CallableSorter callableSorter2 = new CallableSorter(list2);
        CallableSorter callableSorter3 = new CallableSorter(list3);
        CallableSorter callableSorter4 = new CallableSorter(list4);

        // one by one
//        start = Calendar.getInstance().getTimeInMillis();
//        callableSorter1.call();
//        end = Calendar.getInstance().getTimeInMillis();
//        time = end - start;
//        System.out.println("Time it took: "+time+" ms");
//
//        start = Calendar.getInstance().getTimeInMillis();

//        callableSorter2.call();
//        end = Calendar.getInstance().getTimeInMillis();
//        time = end - start;
//        System.out.println("Time it took: "+time+" ms");
//
//        start = Calendar.getInstance().getTimeInMillis();

//        callableSorter3.call();
//        end = Calendar.getInstance().getTimeInMillis();
//        time = end - start;
//        System.out.println("Time it took: "+time+" ms");
//
//        start = Calendar.getInstance().getTimeInMillis();

//        callableSorter4.call();
//        end = Calendar.getInstance().getTimeInMillis();
//        time = end - start;
//        System.out.println("Time it took: "+time+" ms");

        //all at the same time
        start = Calendar.getInstance().getTimeInMillis();
        callableSorter1.call();
        callableSorter2.call();
        callableSorter3.call();
        callableSorter4.call();
        end = Calendar.getInstance().getTimeInMillis();
        time = end - start;
        System.out.println("Time it took: "+time+" ms");

        //Task 15
        System.out.println("-------Task 15-------");
        SuperNumber<Double> num1 = new SuperNumber<>(10.0);
        SuperNumber<Integer> num2 = new SuperNumber<>(11);

        System.out.println("Double as Double: "+num1.returnDouble());
        System.out.println("Double as int: "+num1.returnInt());
        System.out.println("int as Double: "+num2.returnDouble());
        System.out.println("int as int: "+num2.returnInt());
        System.out.println("Type of first number: ");
        num1.type();
        System.out.println("Type of second number: ");
        num2.type();

        System.out.println(num1.checkIfDoubleInt());
        System.out.println(num1.checkWithOtherInt(num2));
        System.out.println(num1.checkIfOtherDouble(num2));

        //Task 16
        System.out.println("-------Task 16-------");
        Container<Integer> num = new Container<>();
        num.add(22);
        num.add(33);
        num.add(44);
        System.out.println(num.changes);

        //Task 17
        System.out.println("-------Task 17-------");
        ContainerWithMemory<Integer> cwm = new ContainerWithMemory();
        cwm.add(1);
        cwm.add(2);
        cwm.add(3);
        System.out.println(cwm.version.get(1));
        System.out.println(cwm.version.get(2));
        System.out.println(cwm.version.get(3));
        cwm.remove(2);
        System.out.println(cwm.version.get(4));
        cwm.restoreVersion(2);
        System.out.println(cwm.memory);

    }
}
