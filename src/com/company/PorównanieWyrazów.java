package com.company;


import java.util.ArrayList;

/**
 * <h1>PorównanieWyrazów</h1>
 * Klasa PrównanieWyrazów ma za zadanie porównać dwa wyrazy czy składają się z tych samych
 * znaków oraz sprawdzić ile i jakich znaków ma każdy wyraz.
 *
 * @author  mareo11
 * @version 1.0
 * @since   2021-12-10
 */

public class PorównanieWyrazów {

    /**
     * Ta metoda porównuje czy podane wyrazy są takie same. Najpierw dodaje wyrazy do tablic
     * następnie sprawdza długość nowo powstałych tablic i przypisuje je do zmiennej wynik
     * Następnie przyrównuje do siebie elementy obu tablic gdy wartość są równe zmniejsza zmienną wynik o 1 i zaczyna
     * jeszcze raz. Potem zmienna wynik jest sprawdzana , jeżeli wynosi 0 wyrazy są takie same jeśli nie to nie są.
     *
     * @author  mareo11
     * @version 1.0
     * @since   2021-12-10
     */
    public void sprawdź_czy_takie_same(String wyraz1, String wyraz2)
    {

        char [] tablica1 = wyraz1.toCharArray();
        char [] tablica2 = wyraz2.toCharArray();

        int len1 = tablica1.length;
        int len2 = tablica2.length;

        int wynik ;

        if(tablica1.length > tablica2.length)
            wynik = tablica1.length;

        else if(tablica2.length > tablica1.length)
            wynik = tablica2.length;

        else
            wynik = tablica1.length;


        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (tablica2[j] == tablica1[i])
                {
                    wynik--;
                    break;
                }
            }
        }

        if(wynik == 0)
        {
            System.out.println("Wyrazy składają się z tych samych liter");
        }
        else
        {
            System.out.println("Wyrazy nie składają się z tych samych liter");
        }
    }

    /**
     * Metoda wypisz_litery wypisuje litery z podanego słowa oraz ilość występowania.
     * Z podanego wyrazu zostaje stworzona tablica znaków , następnie każy z znaków jest porównywany w momencie
     * gdy znaki są takie same zwiększa zmienną licznik o 1. Następnie metoda wypisuje litery oraz ich ilość występowania
     * w danym słowie, aby uniknąć powtórzeń w wypisywaniu liter które się powtarzają zostaje stworzona lista do
     * której przypisywane są litery już wyświetlone.
     *
     * @author  mareo11
     * @version 1.0
     * @since   2021-12-10
     */
    public void wypisz_litery(String wyraz1)
    {
        char [] tablica1 = wyraz1.toCharArray();
        ArrayList<Character> tab = new ArrayList<Character>();

        int licznik = 0;

        System.out.print("Wyraz " + wyraz1 + " składa się z liter : ");
        for (int i = 0; i < tablica1.length; i++) {

            boolean ilość = true;

            for (int j = 0; j < tablica1.length ; j++ ) {
                if(tablica1[i] == tablica1[j])
                    licznik++;
            }

            if(licznik == 1)
                System.out.print( licznik + " litery " +tablica1[i]+", ");
            else if(licznik > 1)
            {
                for (int j = 0; j < tab.size(); j++) {
                   if(tab.get(j) == tablica1[i])
                        ilość = false;

                }
                if (ilość == true )
                {
                    System.out.print(licznik + " liter " +tablica1[i]+",");
                    tab.add(tablica1[i]);
                }

            }


            licznik = 0;
        }
        System.out.println();
    }
}
