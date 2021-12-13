package com.company;

public class Parametry {

    public int dodaj(int liczba1 ,int ...args)
    {
        int wynik = liczba1;

        for(int i=0; i<args.length; i++) {

            wynik += args[i];
        }
        return wynik;
    }

}
