import java.util.ArrayList;
public class Pruebas {
    public static void main (String [ ] args) {



        int[] obje = {1,2,3,4,0,5,6,7,8};

        int[] aux =   {1,2,3,0,5,6,4,7,8};



        Etapa auxi = new Etapa(aux, obje);
        auxi.menu();


    }
}