package com.company;

import java.util.*;
import java.util.function.UnaryOperator;

public class ContainerWithMemory<E> extends Container<E>{

    Map<Integer, List<E>> version;
    List<E> memory;
    int changes = 0;

    public ContainerWithMemory() {
        this.version = new HashMap<>();
        this.memory = new ArrayList<>();

    }


    @Override
    public boolean add(E addValue) {
        try {
            memory.add(addValue);
            changes++;
            version.put(changes, new ArrayList<>(memory));
            return true;

        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean remove(Object o) {
        try {
            memory.remove(o);
            changes++;
            version.put(changes, new ArrayList<>(memory));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void restoreVersion(int id){
        memory.clear();
        memory.addAll(version.get(id));



    }
}