package Katonas;

import java.util.Objects;

public class Katona {

    private  int tamadoEro, vedoEro ;

    public Katona(int tamadoEro, int vedoEro) {
        this.tamadoEro = tamadoEro;
        this.vedoEro = vedoEro;
    }

    public Katona() {

        this.tamadoEro = 5 ;
        this.vedoEro = 5 ;
    }

    public int getTamadoEro() {
        return tamadoEro;
    }



    public void setTamadoEro(int tamadoEro) {
        this.tamadoEro = tamadoEro;
    }

    public int getVedoEro() {
        return vedoEro;
    }

    public void setVedoEro(int vedoEro) {
        this.vedoEro = vedoEro;
    }

    public boolean equals(Katona o) {

        if( this.vedoEro == o.vedoEro && this.tamadoEro == o.tamadoEro)
            return true ;

        return false ;
    }

    @Override
    public String toString() {
        return "TE: " + tamadoEro + " VE: " + vedoEro;
    }
}