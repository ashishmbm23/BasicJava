package oop;

class Complex
{
    int x ;
    double y;

    public Complex()
    {

    }

    public Complex(int x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(obj instanceof Complex)
        {
            Complex c = (Complex) obj;
            return Integer.compare(x,c.x) == 0 && Double.compare(y, c.y) == 0;
        }
        return false;
    }
}

public class EquallsDemo {
    public static void equallsDemo()
    {
        Complex c1 = new Complex(10,23);
        Complex c2 = new Complex(10,24);
        Complex c3 = new Complex(10,23);

        System.out.println("c1 and c2 equallity :" + c2.equals(c1));
        System.out.println("c1 and c2 equallity :" + c3.equals(c1));
    }
}
