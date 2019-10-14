package Nyolcadik;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String x = "asd";

        while (!x.equals("vége"))
        {
            String beolvas = sc.nextLine();
            x = beolvas;
            if(x.equals("kő") || x.equals("papír") || x.equals("olló") ){

                int teszamod;

                Random rnd = new Random();
                int y = rnd.nextInt(3);

                if(x.equals("kő"))
                    teszamod = 0;
                    else if(x.equals("papír"))
                        teszamod = 1;
                        else
                            teszamod = 2;
;
                if((teszamod == 0 && y ==2) || (teszamod == 1 && y == 0) || (teszamod == 2 && y == 1)){

                    System.out.println("Nyertél!");
                 //   break;
                }
                else {
                    System.out.println("Nem nyertél!");
                   // break;
                }
            }
        }

    }
}
