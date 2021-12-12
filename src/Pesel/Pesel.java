package Pesel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pesel {

    String pesel;
    public Pesel(String pesel)
    {
        this.pesel = pesel;
    }

    public void czy_pełnoletni()
    {
        int rokp = 0;
        int miesiącp = 0;
        String czy_pełnoletni;
        int rok = Integer.parseInt(pesel.substring(0,2));
        int miesiąc = Integer.parseInt(pesel.substring(2,4));
        int dzieńp = Integer.parseInt(pesel.substring(4,6));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //2000-06-22

        Date nowdata = new Date();
        String aktualna_data = sdf.format(nowdata);

        if(rok >= 01 && rok <=20 )
        {
            if(miesiąc >= 01 && miesiąc <=12)
            {
               rokp = 1900 + rok;
            }
            else if(miesiąc >=21 && miesiąc <=32)
            {
                rokp = 2000 + rok;
            }
        }

        if(miesiąc >= 01 && miesiąc <=12)
        {
            miesiącp = miesiąc;
        }
        else if(miesiąc >=21 && miesiąc <=32)
        {
            miesiąc = miesiąc - 20;
            miesiącp = miesiąc;
        }

        int nowrok = Integer.parseInt(aktualna_data.substring(0,4));
        int nowmiesiąc = Integer.parseInt(aktualna_data.substring(5,7));
        int nowdzień = Integer.parseInt(aktualna_data.substring(8,10));

        int wiek;

        if((nowdzień - dzieńp) <= 0)
        {
                nowmiesiąc -= 1;
                if((nowmiesiąc - miesiącp) <= 0 )
                {
                    nowrok -= 1;
                    wiek = nowrok - rokp;
                }
                else
                {
                    wiek = nowrok - rokp;
                }
        }
        else
        {
            wiek = nowrok - rokp;
        }

        if(wiek >= 18)
        {
            System.out.println("Obywatel pełnoletni");
        }
        else
        {
            System.out.println("Obywatel nie pełnoletni");
        }
    }
}
