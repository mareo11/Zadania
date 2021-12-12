package Pesel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Podaj pesel:");
        String pesel = obj.nextLine();
        Pesel p = new Pesel(pesel);

        p.czy_pełnoletni();
    }

}
