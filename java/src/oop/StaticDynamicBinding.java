package oop;


public class StaticDynamicBinding {
    public static class Superclass
    {
        public static void display()
        {
            System.out.println("Superclass static");
        }

        public void nonDisplay()
        {
            System.out.println("Superclass non static");
        }
    }

    public static class Subclass extends Superclass
    {
        public static void display()
        {
            System.out.println("Subclass static");
        }

        @Override
        public void nonDisplay() {
            System.out.println("subclass non static");
        }
    }

    public static void main(String[] args) {
        Superclass sc1 = new Subclass();
        Superclass sc2 = new Superclass();
        Subclass sc3 = new Subclass();

        System.out.println("Dynamic binding");
        System.out.println("example is overriding, the JVM will check object reference to call appropriate method at run time");
        sc1.nonDisplay();
        sc2.nonDisplay();
        sc3.nonDisplay();
        System.out.println("Static binding");
        System.out.println("For static,private and final method, static binding is done");
        sc1.display();
        sc2.display();
        sc3.display();

    }
}


