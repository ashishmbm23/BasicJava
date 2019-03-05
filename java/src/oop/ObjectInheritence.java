package oop;

class Fruit
{
    public Fruit()
    {
        System.out.println("Super class constructor");
        System.out.println("Super class name :" + this.getClass().getName());
        System.out.println("Super class hashcode :" + this.hashCode());
    }
}

class Apple extends Fruit
{
    public Apple()
    {
        System.out.println("sub class constructor");
        System.out.println("sub class name :" + this.getClass().getName());
        System.out.println("sub class hashcode :" + this.hashCode());
        System.out.println("super class hashcode :" + super.hashCode());
    }
}

public class ObjectInheritence {
    public static void objectInheritenceDemo()
    {
        Apple apple = new Apple();
    }
}
