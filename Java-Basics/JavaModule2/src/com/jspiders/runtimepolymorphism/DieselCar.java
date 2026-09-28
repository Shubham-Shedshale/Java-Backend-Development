package com.jspiders.runtimepolymorphism;

public class DieselCar extends Car
{
    @Override
    void fuel()
    {
        System.out.println("runs with diesel");

    }
}
