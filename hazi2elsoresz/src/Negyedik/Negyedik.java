package Negyedik;


import java.util.Date;

class Autó {

    private String rendszám;
    private int motorTeljesitmeny;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesitmeny) {
        this.rendszám = rendszám;
        this.motorTeljesitmeny = motorTeljesitmeny;
    }

    public String getRendszám() {
        return rendszám;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    @Override
    public String toString() {
        return "Autó{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Teherautó extends Autó implements Comparable{
    private int maxSzállthatóTeher;

    public Teherautó(String rendszám, int motorTeljesitmeny, int maxSzállthatóTeher) {
        super(rendszám, motorTeljesitmeny);
        this.maxSzállthatóTeher = maxSzállthatóTeher;
    }

    public int getMaxSzállthatóTeher() {
        return maxSzállthatóTeher;
    }

    @Override
    public String toString() {
        return "rendszam: " + this.getRendszám() + " motorteljesitmeny: " + this.getMotorTeljesitmeny() + " maxteher: " + this.getMaxSzállthatóTeher() ;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        Teherautó x =  (Teherautó)o;
        return x.maxSzállthatóTeher - this.maxSzállthatóTeher;
    }
}



public class Negyedik {
}
