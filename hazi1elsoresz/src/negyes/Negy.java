
package negyes;

import java.util.Date;
import java.util.Objects;


public class Negy {
    
    protected String név;
    protected String kiszerelés;
    private static int ár = 10;
    protected Date gyártásiDátum;

    public Negy(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public static void setÁr(int ár) {
        Negy.ár = ár;
    }

    @Override
    public String toString() {
        return this.név + ", " + this.kiszerelés + ", " + Negy.ár + " Ft";
    }

    @Override
    public boolean equals(Object o) {
        Negy ital = (Negy)o;
        return (this.név == ital.név) && (this.kiszerelés == ital.kiszerelés) && (Negy.ár == ital.getÁr());
    }

    static double getÁrEuróban() {
        return Negy.ár / 320.0;
    }

    public static void main(String[] args) {
        Negy asd = new Negy("abc", "asd");
        Negy abc = new Negy("abc", "asd");
        System.out.println(asd.equals(abc));
        System.out.println(abc.getÁrEuróban());
    }
    
}
