package sedgewick;

public class Recursion
{
    int sum(int n)
    {
        if ( n <=0) return 0;
        return (n+sum(n-1));
    }
    int fact(int n)
    {
        if (n<=1) return 1;
        return (n*fact(n-1));
    }
    int powerOf10(int n)
    {
        if (n==0) return 1;
        return (10*powerOf10(n-1));
    }
    int powerOfN(int x, int p)
    {
        if ( p== 1) return x;
        return (x*powerOfN(x,p-1));
    }

    int BunnyEars(int n)
    {
        if (n==1) return 2;
        return (2*BunnyEars(n-1));
    }
    public static void main(String arg[])
    {
        Recursion recursion = new Recursion();
        int s = recursion.sum(6);
        System.out.println("Sum = "+s);
        int f = recursion.fact(5);
        System.out.println("Factorial of 5 is "+f);
        int pt=recursion.powerOf10(5);
        System.out.println("10 to the power of 5 is "+pt);
        int pn = recursion.powerOfN(3,5);
        System.out.println("3 to the power of 5 is " +pn);
        int bn=recursion.BunnyEars(5);
        System.out.println("5 Bunny Ears = "+bn);
    }
}