package Harmadik;

class VendéglátóipariEgység{
        private String név;
        private int férőhelyekszáma;
        private boolean dohányzó;


        public VendéglátóipariEgység(String név, int férőhelyekszáma, boolean dohányzó) {
            this.név = név;
            this.férőhelyekszáma = férőhelyekszáma;
            this.dohányzó = dohányzó;
        }

        public String getNév() {
            return név;
        }

        public int getFérőhelyekszáma() {
            return férőhelyekszáma;
        }

        public void setDohányzó(boolean dohányzó) {
            this.dohányzó = dohányzó;
        }

        public boolean isDohányzó() {
            return dohányzó;
        }

        @Override
        public String toString() {
            return "Harmadik.VendéglátóipariEgység{" +
                    "név='" + név + '\'' +
                    ", férőhelyekszáma=" + férőhelyekszáma +
                    ", dohányzó=" + dohányzó +
                    '}';
        }
    }

    class Étterem extends VendéglátóipariEgység{
       private String[] étlap;

        public Étterem(String név, int férőhelyekszáma, String[] étlap) {
            super(név, férőhelyekszáma, false);
            this.étlap = étlap;
        }

        public String[] getÉtlap() {
            return étlap;
        }

        @Override
        public String toString() {
            return "Harmadik.Étterem{" +
                    "étlap='" + étlap + '\'' +
                    '}';
        }
    }

    class Kocsma extends VendéglátóipariEgység{

    private String[] sörlap;

        public Kocsma(String név, int férőhelyekszáma, String[] sörlap) {
            super(név, férőhelyekszáma, true);
            this.sörlap = sörlap;
        }

        public String[] getSörlap() {
            return sörlap;
        }

        @Override
        public String toString() {
            return this.getNév();
        }
    }


    public class Harmadik
    {
        public static void main(String[] args) {


            VendéglátóipariEgység[] VIE = new VendéglátóipariEgység[10];

            VIE[0] = new Étterem("asd1",1, new String[]{"leves", "rantotthus", "köret"});
            VIE[1] = new Étterem("asd2",4, new String[]{"leves", "rantotthus", "köret"});
            VIE[2] = new Étterem("asd3",6, new String[]{"leves", "rantotthus", "köret"});
            VIE[3] = new Étterem("asd4",20, new String[]{"leves", "rantotthus", "köret"});
            VIE[4] = new Étterem("asd5",15, new String[]{"leves", "rantotthus", "köret"});

            VIE[5] = new Kocsma("asd6",10, new String[]{"dreher", "heineken", "aranyaszok"});
            VIE[6] = new Kocsma("asd7",20, new String[]{"dreher", "heineken", "aranyaszok"});
            VIE[7] = new Kocsma("asd8",30, new String[]{"dreher", "heineken", "aranyaszok"});
            VIE[8] = new Kocsma("asd9",40, new String[]{"dreher", "heineken", "aranyaszok"});
            VIE[9] = new Kocsma("asd10",50, new String[]{"dreher", "heineken", "aranyaszok"});


            for(Kocsma element : adottItaltKinaloKocsmak("dreher",VIE)){
                System.out.println(element);
            }

        }
        public static Kocsma[] adottItaltKinaloKocsmak(String ital, VendéglátóipariEgység[] t)
        {
            Kocsma[] lista = new Kocsma[10];
            int listadarabszam = 0;


            for(int i = 0; i < t.length; i++)
            {
                if(t[i] instanceof Kocsma)
                {
                    Kocsma kocs = (Kocsma)t[i];
                    String[] sorlap = kocs.getSörlap();
                    for(int k = 0; k < sorlap.length; k++)
                    {
                        if(sorlap[k] == ital){
                            lista[listadarabszam++] = kocs;
                        }


                    }
                }
            }
            Kocsma[] tomb = new Kocsma[listadarabszam];
            for (int j = 0; j < listadarabszam; j++)
                tomb[j] = lista[j];
            return tomb;
        }
    }
