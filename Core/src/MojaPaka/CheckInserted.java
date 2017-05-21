package MojaPaka;

public class CheckInserted {

    public static boolean doOrNot;
    private static long l;

    public CheckInserted() {
        CheckInserted.checkInserted();
    }

    static class IsNumber {                      // mozna sama metode uzyc bez klasy wewnetrznej. Czy caly program moze bazowac na klasach wewnwtrznych???
        /**
         * method check or inserted PESEL number is a number
         * @return true / false
         */
        public static boolean isNumber() {
            try {
                l = Long.parseLong(Insert.getP());
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
    }

    /**
     * method:
     * - prints inserted PESEL number
     * - check or inserted PESEL number isn't null
     * - check or inserted PESEL number is negative
     * - check correct length of inserted PESEL number
     */
    public static void checkInserted() {
        IsNumber isNumber = new IsNumber();

        doOrNot = false;
        System.out.println("\n" +
                "Inserted PESEL number is: ---> " + Insert.getP() + " <---");
        if (0 == Insert.getP().length()) {
            System.out.println("You didn't insert anything!");

        } else if (IsNumber.isNumber()) {
            if (l < 0) {
                System.out.println("You inserted negative number!");
            } else {
                if (Insert.getP().length() != 11) {
                    System.out.println("You inserted incorrect number." + "\n" + "Length of every pesel number must contains 11 digits!" + "\n" + "Inserted number is " + Insert.getP().length() + " digit(s) long.");
                } else if (Validate.validate()) {
                    doOrNot = true;
                }
            }
        } else {
            System.out.println("Just numbers allowed, not other signs!");
        }
    }
}