package com.vijay.start;

public class Car1 implements ICar{

    public void drive()
    {
        System.out.println("driving");

    }
    public static  void main(String args[])
    {

        ICar c1=new Car1();
        c1.drive();
    }
}
