package Katonas;

public class Teszt {

    public static Katona megkuzd(Katona k1, Katona k2) {


        if (k1.getTamadoEro() > k2.getTamadoEro())
            return k1;

        if (k1.getTamadoEro() < k1.getTamadoEro())
            return k2;
        return k1;
    }

    public static void main(String[] args) {

        Katona[] katonak = new Katona[3];
        Nyilas[] nyListaja = new Nyilas[2];
        Landzsas[] lListaja = new Landzsas[1];

        nyListaja[0] = new Nyilas(50, 42, 62);
        nyListaja[1] = new Nyilas(45, 32, 97);

        katonak[0] = nyListaja[0];
        katonak[1] = nyListaja[1];

        lListaja[0] = new Landzsas(54, 96);
        katonak[2] = lListaja[0];

        System.out.println("Első küzdelem:");
        System.out.println(katonak[0] + " és " + katonak[1] + " harcoltak!");
        System.out.println("Nyertes:");
        System.out.println(megkuzd(katonak[0], katonak[1]));
        System.out.println();
        System.out.println("Küzdelem, első győztese és egy harmadik között:");
        System.out.println(megkuzd(katonak[0], katonak[1])  + " és " + katonak[2] + " küzdött meg!");
        System.out.println("Nyertes:");
        System.out.println(megkuzd(megkuzd(katonak[0], katonak[1]), katonak[2] ));
    }
}