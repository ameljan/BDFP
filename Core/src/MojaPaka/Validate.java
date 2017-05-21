package MojaPaka;

public class Validate {

    /**
     * method validates inserted PESEL number according to official, government pattern:
     * counts checksum and compares last sing of checksum to the last sing of inserted PESEL number
     * @return true / false + information
     */
    public static boolean validate() {

            int checkSum; // zmienne lokalne to nie musze private
            int checkSumLength;

            int a = Integer.parseInt(Insert.getP().substring(0, 1));
            int b = Integer.parseInt(Insert.getP().substring(1, 2));
            int c = Integer.parseInt(Insert.getP().substring(2, 3));
            int d = Integer.parseInt(Insert.getP().substring(3, 4));
            int e = Integer.parseInt(Insert.getP().substring(4, 5));
            int f = Integer.parseInt(Insert.getP().substring(5, 6));
            int g = Integer.parseInt(Insert.getP().substring(6, 7));
            int h = Integer.parseInt(Insert.getP().substring(7, 8));
            int i = Integer.parseInt(Insert.getP().substring(8, 9));
            int j = Integer.parseInt(Insert.getP().substring(9, 10));

            checkSum = 9 * a + 7 * b + 3 * c + 1 * d + 9 * e + 7 * f + 3 * g + 1 * h + 9 * i + 7 * j;

            checkSumLength = Integer.toString(checkSum).length(); //zamieniam sume kontrolna na string aby miec dlugosc stringu. Mozna to zrobic bez zmiennej checkSumLength ale nastepna linia bylaby mega dluga
            if (Insert.getP().substring(10, 11).equals(Integer.toString(checkSum).substring(checkSumLength - 1, checkSumLength))) { // if last sign in p equals to last sign checksum
                return true;
            } else {
                System.out.println("Inserted invalid data - check sum is incorrect!");
                return false;
            }
        }
    }


