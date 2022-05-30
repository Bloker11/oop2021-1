package com.company;

public class SuperNumber<T extends Number> {

    private T number;


    public SuperNumber(T number) {
        this.number = number;
    }


    public void type(){
        System.out.println(number.getClass().getName());
    }

    public double returnDouble(){
        return number.doubleValue();
    }

    public int returnInt(){
        return number.intValue();
    }
    public boolean checkIfDoubleInt(){
        if (number.doubleValue() == number.intValue()){
            return true;
        } else{
            return false;
        }

    }


        public boolean checkWithOtherInt(SuperNumber<?> otherSuperNumber){
        if (number.intValue() == otherSuperNumber.number.intValue()){
            return true;
        }else{
            return false;
        }

    }

    public boolean checkIfOtherDouble(SuperNumber<?> otherSuperNumber){
        if (number.doubleValue() == otherSuperNumber.number.doubleValue()){
            return true;
        }else{
            return false;
        }

    }
}