package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Wybierz co chcesz wykonać:\n" +
                "1-Wyświetlanie listy\n" +
                "2-Porównanie wyrazów");
        int wybierz = obj.nextInt();

        if(wybierz == 1)
        {
            Lista lista = new Lista();
            System.out.println("1 - Za pomocą iteratora\n" +
                    "2-Za pomocą generyków");

            int wyb = obj.nextInt();
            if(wyb == 1)
                lista.Iterator();

            else if(wyb == 2)
                lista.generyki();
            else
                System.out.println("Błąd wyboru");
        }
        else if(wybierz == 2)
        {
            obj.nextLine();

            System.out.println("Podaj pierwszy wyraz");
            String wyraz1 = obj.nextLine();

            System.out.println("Podaj drugi wyraz");
            String wyraz2 = obj.nextLine();

            PorównanieWyrazów pw = new PorównanieWyrazów();

            pw.wypisz_litery(wyraz1);
            pw.wypisz_litery(wyraz2);
            pw.sprawdź_czy_takie_same(wyraz1,wyraz2);

        }

        else
            System.out.println("Błąd wyboru");


    }
}
