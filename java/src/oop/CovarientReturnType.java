package oop;

    class A
    {

    }
    class B extends A
    {

    }
    class Base
    {
        public A fun()
        {
            System.out.println("Base fun");
            return new A();
        }
    }

    class Derived extends Base
    {
        @Override
        public B fun()
        {
            System.out.println("Derive Fun");
            return new B();
        }
    }

public class CovarientReturnType {
     public static void main(String[] args) {
            Base base = new Base();
            base.fun();

            Derived derived = new Derived();
            derived.fun();
        }
    }

