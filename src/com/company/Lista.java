package com.company;

import java.util.*;

public class Lista {

    String[] drzewa = {"brzoza", "modrzew", "grab", "buk", "wierzba" };

    public void Iterator()
    {
        Iterator<String> it = Arrays.stream(drzewa).iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }

    public void generyki()
    {
        ArrayList<String> al = new ArrayList<String>();

        for (int i = 0; i < drzewa.length; i++) {
            al.add(drzewa[i]);
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
