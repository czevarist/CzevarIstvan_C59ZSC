
import java.util.Arrays;

public class Metodusok {

    static void egy(int x,int y,int z)
    {
        int[] t;
        t = new int[3];
        t[0] = x;
        t[1] = y;
        t[2] = z;
        Arrays.sort(t);

        System.out.println(t[0] + " " + t[1] + " " + t[2]);
    }

    static void ketto(double x,double y,double z)
    {
        double[] t;
        t = new double[3];
        t[0] = x;
        t[1] = y;
        t[2] = z;
        Arrays.sort(t);
        double min = t[0];
        double max = Math.max(Math.abs(t[0]),Math.abs(t[2]));
        System.out.println(min + " " + max);
    }

    static void harom(double a, double b, double c, double d)
    {
        System.out.println(a + " " + b + " " + c + " " + d);
        if(d >= 0)
            System.out.println(a + " " + c + " " + b + " " + d);
        else
            System.out.println(a + " " + b + " " + d + " " + c);


    }

    static boolean negy(double a, double b, double c)
    {
        if(a + b > c && a + c > b && b + c > a)
            return true;
        else
            return false;

    }

    static int öt(int elso, int masodik)
    {
        int db = 0;

        for(int i = elso; i <= masodik; i++)
        {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                db++;
        }
        return db;
    }


    public static void hat(int jegy)
    {
        switch (jegy)
        {
            case 5:
                System.out.println("Jeles");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 1:
                System.out.println("Elégtelen");
                break;
            default:
                System.out.println("Nincs ilyen értékelés!");
        }

    }

    static int het(int a,int b)
    {
        int hanyados = 0;
        while(a >= b)
        {
            hanyados++;
            a -= b;
        }
        return hanyados;
    }

    static boolean nyolc(int x)
    {
        int db = 0;
        for(int i = 1; i < x+1; i++){
            if(x % i == 0)
                db++;

        }
        if(db ==2)
            return true;
        else
            return false;
    }

    static void kilenc(int n)
    {
        int a = 0;
        int b = 1;
        if(n == 1)
            System.out.println(a);
        else
            if(n == 2)
                System.out.println(a + " " + b);
            else
            {
                int c = a + b;
                System.out.print(a + " " + b + " " + c);
                int k = 3;
                while(k < n)
                {
                    a = b;
                    b = c;
                    c = a + b;
                    System.out.print(" " + c);
                    k += 1;
                }
                System.out.println("");
            }

    }
    static int tiz(int n)
    {
        int ujszam = 0;
        while(n != 0)
        {
            ujszam = ujszam * 10 + (n % 10);
            n = (n / 10);
        }
        return ujszam;
    }


    static long tizenegy(int x)
    {

        long szam = 1;
        for(int i = 1; i <= x; i++) {
            szam = szam * i;
        }
        return szam;
    }

    static void tizenketto(int k, int n1, int n2)
    {
        for(int i = n1; i <= n2; i++)
        {
            if(i % k == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }

    static int tizenharom(int n)
    {
        int a = 0;
        int b = 1;
        int c = a + b;
        while(c <= n)
        {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }


    static void tizennegy()
    {
        for(int i = 0; i <= 1000; i++)
        {
            int k = i;
            int szam = 0;
            while(k != 0)
            {
                szam +=  (k % 10)*(k % 10)*(k % 10);
                k = (k / 10);
            }
            //System.out.println(i + " " + szam + " ");
            if(szam == i)
                System.out.print(i + " ");
            szam = 0;
        }

    }

    public static void main(String[] args) {

        System.out.println("Első feladat:");
        egy(3,1,26);

        System.out.println("Második feladat:");
        ketto(3,-4.3,4.4);

        System.out.println("Harmadik feladat:");
        harom(1,5,8,-2);

        System.out.println("Negyedik feladat:");
        System.out.println(negy(5,8,12));

        System.out.println("Ötödik feladat:");
        System.out.println(öt(2296,2300));

        System.out.println("Hatodik feladat:");
        hat(0);

        System.out.println("Hetedik feladat:");
        System.out.println(het(100,10));

        System.out.println("Nyolcadik feladat:");
        System.out.println(nyolc(4));

        System.out.println("Kilencedik feladat:");
        kilenc(8);

        System.out.println("Tizedik feladat:");
        System.out.println(tiz(12345));

        System.out.println("Tizenegyedik feladat:");
        System.out.println(tizenegy(12));

        System.out.println("Tizenkettedik feladat:");
        tizenketto(4,1,25);

        System.out.println("Tizenharmadik feladat:");
        System.out.println(tizenharom(21));

        System.out.println("Tizennegyedik feladat:");
        tizennegy();



    }
}