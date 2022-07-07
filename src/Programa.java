import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Preke> prekes = nuskaitoPrekesIsFailo("prekes.csv");

        isvestiListaAtskiraiEilutemis(prekes);
        isvedaBruksniukus();

        ArrayList<Preke> esanciosPrekes = rastiPrekesSandelyje(prekes);
        isvestiListaAtskiraiEilutemis(esanciosPrekes);

        isvedaBruksniukus();
        System.out.println("prekiuVidurkis(prekes) = " + prekiuVidurkis(prekes));



    }

    public static void isvedaBruksniukus() {
        System.out.println("--------------------------------------------");
    }


    public static ArrayList<Preke> nuskaitoPrekesIsFailo(String failoPavadinimas) {
        ArrayList<Preke> prekes = new ArrayList<>();
        try {
            File failoObjektas = new File(failoPavadinimas);
            Scanner skaitytuvas = new Scanner(failoObjektas);
            skaitytuvas.nextLine();         // pirmą eilutę praleidžiu, nes ten ne duomenys, o tiesiog paaiškinimai stulpelių
            while (skaitytuvas.hasNextLine()) {
                String eilute = skaitytuvas.nextLine();
                String[] stulpeliai = eilute.split(",");
                Preke laikinaPreke = new Preke(Integer.parseInt(stulpeliai[0]), stulpeliai[1], stulpeliai[2], Double.parseDouble(stulpeliai[3]), Integer.parseInt(stulpeliai[4]), stulpeliai[5], stulpeliai[6]);
                prekes.add(laikinaPreke);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nėra tokio failo.");
        }
        return prekes;
    }


    public static void isvestiListaAtskiraiEilutemis(ArrayList<Preke> prekes) {
        for (Preke preke : prekes) {
            System.out.println("preke = " + preke);
        }
    }


    public static ArrayList<Preke> rastiPrekesSandelyje(ArrayList<Preke> visosPrekes) {
        ArrayList<Preke> esanciosPrekes = new ArrayList<>();
        for (Preke preke : visosPrekes) {
            if (preke.arYraSandelyje()) {
                esanciosPrekes.add(preke);
            }
        }
        return esanciosPrekes;
    }


    public static double prekiuSuma(List<Preke> prekes) {
        double suma = 0;
        for (Preke preke : prekes) {
            suma += preke.getKaina();
        }
        return suma;
    }

    public static double prekiuVidurkis(List<Preke> prekes) {
        return prekiuSuma(prekes) / prekes.size();
    }
}
