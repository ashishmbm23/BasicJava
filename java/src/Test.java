import oop.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hi");
        //covarientDemo();
       // objetcDemo();
       // staticClassDemo();
        //equallsDemo();
       // staticDynamicBinding();
        multipleInheritenceDemo();
       // ObjectInInheritence();
    }

    public static void covarientDemo()
    {
        CovarientReturnType.main(null);
    }

    public static void objetcDemo()
    {
        ObjectDemo obj = new ObjectDemo();
        obj.objectDemo();
    }

    public static void staticClassDemo()
    {
        StaticDemo.main(null);
    }

    public static void equallsDemo()
    {
        EquallsDemo.equallsDemo();
    }

    public static void staticDynamicBinding()
    {
        StaticDynamicBinding.main(null);
    }

    public static void multipleInheritenceDemo()
    {
        MultipleInterface.showMI();
    }

    public static void ObjectInInheritence()
    {
        ObjectInheritence.objectInheritenceDemo();
    }

}
