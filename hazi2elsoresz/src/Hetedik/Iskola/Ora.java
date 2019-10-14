package Hetedik.Iskola;

public class Ora {

    int kód;
    String óranev;
    int kezdet;

    public Ora(int kód, String óranev, int kezdet) {
        this.kód = kód;
        this.óranev = óranev;
        if(kezdet < 8 && kezdet >=2)
            this.kezdet = 8;
        else if(kezdet > 19 && kezdet < 2)
                this.kezdet = 19;
            else
                this.kezdet = kezdet;
    }

    public int getKód() {
        return kód;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public String getÓranev() {
        return óranev;
    }

    public void setÓranev(String óranev) {
        this.óranev = óranev;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "kod: " + kód + "oranev: " + óranev + "kezdet: " + kezdet;
    }
}
