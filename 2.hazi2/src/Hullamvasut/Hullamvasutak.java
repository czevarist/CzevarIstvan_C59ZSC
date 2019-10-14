package Hullamvasut;

import java.util.Arrays;
import java.util.Scanner;

class Adatok implements Comparable{
    String vasutnev;
    String vilagnev;
    int magassag;
    int varakozas;

    public Adatok(String vasutnev, String vilagnev, int magassag, int varakozas) {
        this.vasutnev = vasutnev;
        this.vilagnev = vilagnev;
        this.magassag = magassag;
        this.varakozas = varakozas;

    }

    @Override
    public int compareTo(Object o) {
        Adatok x = (Adatok) o;
        if(this.varakozas == x.varakozas)
        {
            if(this.magassag == x.magassag)
            {
                this.vasutnev.compareTo(x.vasutnev);
            }
            else return x.magassag - this.magassag;
        }
        else return this.varakozas - x.varakozas;
        return 0;
    }
}

public class Hullamvasutak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Adatok[] t = new Adatok[n];
        int db = 0;

        while(db != n)
        {
            String[] beolvas = sc.nextLine().split(";");
            t[db] = new Adatok(beolvas[0],beolvas[1],Integer.parseInt(beolvas[2]),Integer.parseInt(beolvas[3]));
            db++;
        }
        Arrays.sort(t);
        for(int i = 0; i < db; i++)
        {
            System.out.println(t[i].vasutnev + " (" + t[i].vilagnev + "): " + t[i].varakozas);
        }

    }
}