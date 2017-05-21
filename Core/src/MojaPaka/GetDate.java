//dlaczego nie moge RENAME


package MojaPaka;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GetDate {

    public GetDate() {
        getDate();
        //        GetDate.getDate();  // moze byc tez tak i dziala, ale dlaczego? po prostu konstruktor wywoluje metode i tyle?


//        GetDate getDate = new GetDate();  // czyli nie mozna bez static ??? rekursja sie robi i java.lang.StackOverflowError
//        getDate.getDate();

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * method:
     * - get inserted PESEL number checked according to syntax
     * - converts appropriate parts of PESEL number into date format and checks or resulted date exists in calendar (if not prints information, if yes prints date of birth)
     */
    private void getDate() {
        if (CheckInserted.doOrNot) {
            String day = Insert.getP().substring(4, 6);
            String month = Insert.getP().substring(2, 4);
            String year = Insert.getP().substring(0, 2);

            int m = Integer.valueOf(month);
            int y = Integer.valueOf(year);
            int d = Integer.valueOf(day);

            if (m > 12 && m < 33) {
                y = 2000 + y;
                m = m - 20;
            } else if (m > 32 && m < 53) {
                y = 2100 + y;
                m = m - 40;
            } else if (m > 52 && m < 73) {
                y = 2200 + y;
                m = m - 60;
            } else if (m > 72 && m < 93) {
                y = 1800 + y;
                m = m - 80;
            } else {
                y = 1900 + y;
            }

            year = Integer.toString(y);
            month = Integer.toString(m);
/* validation: the birth date exists or not*/
            DateFormat format = new SimpleDateFormat("yyyy.MM.dd");
            try {
                format.parse(year + "." + month + "." + day); //=> Ok, rolls to date e.g. "Wed Mar 03 00:00:00 PST 2010".
                format.setLenient(false);
                format.parse(year + "." + month + "." + day); //=> Throws ParseException "Unparseable date".
                System.out.println(String.format("\n" + "Your date of birth is: %04d.%02d.%02d\n\n", y, m, d)); //Question: czy takie uproszczenie sie robi czy to powinno byc osobna metoda?

            } catch (ParseException e) {
                System.out.println("Incorrect numbers describing date of birth!\n" + "Pay attention to digit 5 and 6!");
            }
        }
    }
}