package Negyedik;

import java.util.Arrays;

public class Test {

    void rendezMaxSzállithatoTeherCsökkenöleg(Teherautó[] teher)
    {
        Arrays.sort(teher);
    }

    Autó keresMaxMotorTeljesitmeny(Autó[] auto)
    {
        Autó asd = new Autó("asd", 0);
        int max = 0;

        for(int i = 0; i < auto.length; i++)
        {
            if(auto[i].getMotorTeljesitmeny() > max)
            {
                asd = auto[i];
                max = auto[i].getMotorTeljesitmeny();
            }

        }
        return asd;
    }




    public void main() {

        Autó[] auto = new Autó[10];

        auto[0] = new Autó("asd-123",100);
        auto[1] = new Autó("abc-123",200);
        auto[2] = new Autó("qwe-123",300);
        auto[3] = new Autó("yxc-123",400);
        auto[4] = new Autó("ert-123",500);
        auto[5] = new Teherautó("ewq-321",600,1100);
        auto[6] = new Teherautó("dsa-321",700,1200);
        auto[7] = new Teherautó("cyx-321",800,1300);
        auto[8] = new Teherautó("rtz-321",900,1400);
        auto[9] = new Teherautó("hgf-321",1000,1500);

        Teherautó[] tehera = new Teherautó[10];
        tehera[0] = new Teherautó("ewq-321",600,1100);
        tehera[1] = new Teherautó("dsa-321",700,1200);
        tehera[2] = new Teherautó("cyx-321",800,1300);
        tehera[3] = new Teherautó("rtz-321",900,1400);
        tehera[4] = new Teherautó("hgf-321",1000,1500);
        tehera[5] = new Teherautó("cft-321",550,950);
        tehera[6] = new Teherautó("vgt-321",650,1050);
        tehera[7] = new Teherautó("bhu-321",750,1150);
        tehera[8] = new Teherautó("nji-321",850,1250);
        tehera[9] = new Teherautó("mko-321",950,1350);

        rendezMaxSzállithatoTeherCsökkenöleg(tehera);
        System.out.println(keresMaxMotorTeljesitmeny(auto));

        for(int i = 0; i < tehera.length; i++)
        {
            System.out.println(tehera[i]);
        }

    }
}
