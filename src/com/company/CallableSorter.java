package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CallableSorter implements Callable<Object> {
    private List<Integer> listOfNumbers;

    public CallableSorter(List<Integer> integerList) {
        this.listOfNumbers = integerList;
    }

    @Override
    public Object call() throws Exception {

        int n = listOfNumbers.size();
        int temp = 0;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < (n - i - 1); j++) {

                if (listOfNumbers.get(j) > listOfNumbers.get(j + 1)) {
                    temp = listOfNumbers.get(j);
                    listOfNumbers.set(j, listOfNumbers.get(j + 1));
                    listOfNumbers.set(j + 1, temp);
                }
            }

        System.out.println(listOfNumbers);
        return listOfNumbers;
    }
}


