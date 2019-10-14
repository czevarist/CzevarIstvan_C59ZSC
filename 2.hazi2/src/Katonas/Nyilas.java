package Katonas;

import java.util.Objects;

public class Nyilas  extends Katona{


    private int lotav ;

    public Nyilas(int tamadoEro, int vedoEro, int lotav) {
        super(tamadoEro, vedoEro);
        this.lotav = lotav;
    }


    public int getLotav() {
        return lotav ;
    }

    public  int getTamadoEroNyilas(){

        return  lotav + getTamadoEro() ;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: TE:" + getTamadoEro() + ", VE: " + getVedoEro();
    }

    public boolean equals(Nyilas o) {

        if (o.getTamadoEro() == this.getTamadoEro() && o.getVedoEro() == this.getVedoEro()
                && this.lotav == o.lotav)
            return true;

        return false ;
    }

}
