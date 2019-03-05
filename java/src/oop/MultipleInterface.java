package oop;

interface Grandparent
{
    public default void show()
    {
        System.out.println("Grandparent show");
    }
}

interface Parent1 extends Grandparent
{
    public default void show()
    {
        Grandparent.super.show();
        System.out.println("Parent 1 Show");
    }
}

interface Parent2 extends Grandparent
{
    public default void show()
    {
        Grandparent.super.show();
        System.out.println("Parent 2 Show");
    }
}

public class MultipleInterface implements Grandparent,Parent1,Parent2{
    @Override
    public void show() {
        Parent1.super.show();
        Parent2.super.show();
        //Grandparent.super.show();
    }
    public static void showMI()
    {
        MultipleInterface multipleInterface = new MultipleInterface();
        multipleInterface.show();
    }
}
