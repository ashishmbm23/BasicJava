package oop;

public class ObjectDemo implements Cloneable{

    @Override
    public String toString() {

        String per_toString = getClass().getName();

        return per_toString;
    }

    public String def_toString()
    {
        String def_toString = getClass().getName() + "@" + Integer.toHexString(hashCode());
        return def_toString;
    }

    public void objectDemo()
    {
       // ObjectDemo ob = new ObjectDemo();
        System.out.println("Default to string");
        System.out.println(this.def_toString());
        System.out.println("Personal;ized to string");
        System.out.println(this);
        cloneDemo();
    }

    public void cloneDemo()
    {
        try {
            ObjectDemo obj = (ObjectDemo) this.clone();
            System.out.println(obj.def_toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
