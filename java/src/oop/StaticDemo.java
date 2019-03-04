package oop;

//Outer class can not be static
class OuterClass
{
    public static String msg  ;
    {
        System.out.println("Outer class IIB 1");
    }

    static
    {
        System.out.println("Static block called");
        System.out.println("Static block called the first time you refenrence static variable");
        System.out.println("or before the constructor calling");
        System.out.println("Also, it's called only once");
        msg = "Hi static people";
    }

    {
        System.out.println("Outer class IIB 2");
    }

    public OuterClass()
    {
        System.out.println("Outer class Constructor called");
    }
    //Static inner class
    static class StaticInnerClass
    {
        //It can only access static member. Non static members can't access by static class
        public void display()
        {
            System.out.println("Message from static inner class");
            System.out.println(msg);
        }
        static
        {
            System.out.println("Inner static block");
        }
        public StaticInnerClass()
        {
            System.out.println("Inner static class constructor");
        }
        {
            System.out.println("Inner static class IIB 1");
        }
    }

    class NonStaticInnerClass
    {
        public void display()
        {
            System.out.println("Message from non static inner class");
            System.out.println(msg);
        }

        {
            System.out.println("Inner non static class IIB 1" );
        }
        public NonStaticInnerClass()
        {
            System.out.println("Inner non static class constructor");
        }
        {
            System.out.println("Inner non static class IIB 2");
        }
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        //static class reference. We do not need outer class object for this
        OuterClass.StaticInnerClass stIn = new OuterClass.StaticInnerClass();
        stIn.display();

        //For non static inner class we need reference of outert class too
        OuterClass.NonStaticInnerClass nonStIn = new OuterClass().new NonStaticInnerClass();
        nonStIn.display();
    }
}
